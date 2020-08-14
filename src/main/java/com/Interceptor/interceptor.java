package com.Interceptor;

//import org.springframework.web.servlet.HandlerInterceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class interceptor  implements HandlerInterceptor {
    final int num=17;
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {

//        String res = httpServletRequest.getContextPath();
//        String substring = res;
//        System.out.println(substring);
//        String[] split = substring.split("\\?");
//        String substring1 = split[0].substring(0, 1);
//        int i = Integer.parseInt(substring1);
//        if (i!=num){
//            return false;
//        }
        System.out.println("chenggon");

        return true;
    }

    @Override
    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("±¾À¹½ØÆ÷Ö´ÐÐ");
    }

    @Override
    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("±¾À¹½ØÆ÷Ö´ÐÐ");
    }
}
