package com.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ZHOUYAO on 2018/4/21.
 */
@ControllerAdvice
public class ImoocExceptionHandler {
    public  static final String IMOOC_ERROR_VIEW = "error";

         @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception e)throws
         Exception{
               e.printStackTrace();
             ModelAndView mav = new ModelAndView();
             mav.addObject("exception",e);
             mav.addObject("url",request.getRequestURL());
             mav.setViewName(IMOOC_ERROR_VIEW);
             return mav;
    }

}
