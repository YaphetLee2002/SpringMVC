package com.skooch.exception;

//exception包中存放各种异常类
//这个异常类用于处理系统异常
//自定义异常处理器，用于封装异常信息，对异常进行分类
//继承RuntimeException，后期不需要try...catch或throws
public class SystemException extends RuntimeException{

    //code用于进行区分
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


}
