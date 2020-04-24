package com.company.project.web;

import com.company.project.core.ServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

/**
 * @author ZhangNima
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("_me")
    public Authentication auth() {
        return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication())
                .orElseThrow(ServiceException::new);
    }

    @GetMapping("/count")
    public String count(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        Object count = httpServletRequest.getServletContext().getAttribute("count");
        return "count : " + count;
    }

}
