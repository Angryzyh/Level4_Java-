package com.angryzyh.thymeleaf.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
/*异常处理器*/
public class TestExceptionController {

    //@ExceptionHandler用于设置所标识方法处理的异常
    @ExceptionHandler(NullPointerException.class)
    //ex表示当前请求处理中出现的异常对象
    public String handleArithmeticException(Exception ex, Model model){
        model.addAttribute("ex", ex);
        return "error";
    }

}
