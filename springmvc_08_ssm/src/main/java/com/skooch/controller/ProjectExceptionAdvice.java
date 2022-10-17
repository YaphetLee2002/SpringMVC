package com.skooch.controller;

import com.skooch.exception.BusinessException;
import com.skooch.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException exception) {
        //记录异常
        //发送消息给运维
        //发送邮件给开发人员
        return new Result(exception.getCode(), null, exception.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException exception) {
        return new Result(exception.getCode(), null, exception.getMessage());
    }

    //这里处理未知的异常
    @ExceptionHandler(Exception.class)
    public Result doException(Exception exception) {
        //记录异常
        //发送消息给运维
        //发送邮件给开发人员
        return new Result(Code.SYSTEM_UNKNOWN_ERR, null, "系统繁忙，请稍后再试");
    }
}
