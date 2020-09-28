package com.example.exception;

/**
 * @Description: 参数异常
 * @Author: admin
 * @Date: 2020/9/24 18:27
 */
public class ParamRuntimeException extends RuntimeException{

    public ParamRuntimeException (String message){
        super(message);
    }
}
