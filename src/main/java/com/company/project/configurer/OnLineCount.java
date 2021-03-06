package com.company.project.configurer;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextImpl;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class OnLineCount implements HttpSessionListener {
    public int count = 0;//记录session的数量

    //监听session的创建,synchronized 防并发bug
    @Override
    public synchronized void sessionCreated(HttpSessionEvent arg0) {
        SecurityContextImpl context =(SecurityContextImpl)  arg0.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        Authentication authentication = context.getAuthentication();


        System.out.println("【HttpSessionListener监听器】count++  增加");
        count++;
        arg0.getSession().getServletContext().setAttribute("count", count);

    }

    @Override
    public synchronized void sessionDestroyed(HttpSessionEvent arg0) {//监听session的撤销
        System.out.println("【HttpSessionListener监听器】count--  减少");
        count--;
        arg0.getSession().getServletContext().setAttribute("count", count);
    }
}