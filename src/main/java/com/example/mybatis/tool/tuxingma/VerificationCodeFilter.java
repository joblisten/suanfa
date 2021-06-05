package com.example.mybatis.tool.tuxingma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.thymeleaf.util.StringUtils;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class VerificationCodeFilter extends OncePerRequestFilter {





    /*
   图形码校验
    */
    public void ve(HttpServletRequest request) throws VerificationCodeException {

        String requestParameter = request.getParameter("captcha");

        HttpSession session = request.getSession();
        String savecode = (String) session.getAttribute("captcha");

        if (!StringUtils.isEmpty(savecode))
            session.removeAttribute("captcha");
       if(StringUtils.isEmpty(requestParameter)||StringUtils.isEmpty(savecode)||!requestParameter.equals(savecode))
       {


           throw new  VerificationCodeException();

       }



    }
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        if(!"login".equals(httpServletRequest.getRequestURI())){
            filterChain.doFilter(httpServletRequest,httpServletResponse);

        }
        else{
            try {
                ve(httpServletRequest);
                filterChain.doFilter(httpServletRequest,httpServletResponse);
            } catch (VerificationCodeException e) {


            }


        }
    }
}
