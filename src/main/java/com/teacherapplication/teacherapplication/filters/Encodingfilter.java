/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teacherapplication.teacherapplication.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author christy
 */
@Component
@Order(1)
public class Encodingfilter implements Filter {

    @Override
    public void doFilter(ServletRequest sr, 
                        ServletResponse sr1, 
                        FilterChain chain) throws IOException, ServletException {
       
       
        sr.setCharacterEncoding("UTF-8");
        sr1.setCharacterEncoding("UTF-8");
        
        HttpServletRequest request=(HttpServletRequest)  sr;
        HttpServletResponse response=(HttpServletResponse)  sr1;
        
        
        System.out.println("lalala");
        System.out.println(request.getRequestURI());
        System.out.println(request.getMethod());
        
        chain.doFilter(sr, sr1);
    }
    
}
