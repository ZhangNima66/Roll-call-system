package com.company.project.core.auth;

import com.company.project.model.Teacher;
import com.company.project.model.User;
import com.company.project.service.TeacherService;
import com.company.project.service.UserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * 用户名&密码认证方式。
 *
 * @author Ma XueZhi
 */
@Component
public class UsernamePasswordAuthenticationProvider implements AuthenticationProvider {

    private static final Logger LOGGER = getLogger(UsernamePasswordAuthenticationProvider.class);

    @Autowired
    private UserService userService;

    @Autowired
    private TeacherService teacherService;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        User user = userService.findBy("login", username);
        if (user == null || !encoder.matches(password, user.getPassword())) {
            LOGGER.info("Account {} was not found in the database", username);
            throw new BadCredentialsException("Username or password is not valid");
        }

        if (user.getAuthorities().contains("ROLE_TEACHER")) {
            Teacher teacher = teacherService.findBy("name", user.getFullName());
            if (teacher != null) {
                user.setRole(teacher);
            }
        }

        List<GrantedAuthority> authorities = user.getAuthorities().stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
        return new UsernamePasswordAuthenticationToken(user, null, authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
