package com.skooch.controller;

import com.skooch.exception.BusinessException;
import com.skooch.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//使用该异常处理器处理exception包中的各种异常
//@RestControllerAdvice用于标识当前类为REST风格对应的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //除了自定义的异常处理器，保留对Exception类型的异常处理，用于处理非预期的异常

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException systemException) {

        //在实际开发中，需要记录异常日志，发送消息给运维，发邮件给开发人员，把Exception对象发送给开发人员
        return new Result(systemException.getCode(), null, systemException.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException businessException) {
        return new Result(businessException.getCode(), null, businessException.getMessage());
    }

    //这里是非预期的异常
    @ExceptionHandler(Exception.class)
    public Result doException() {
        return new Result(Code.SYSTEM_UNKNOW_ERR, null, "系统繁忙，请稍后再试");
    }
}
