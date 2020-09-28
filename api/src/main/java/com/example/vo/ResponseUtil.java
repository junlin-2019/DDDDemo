package com.example.vo;

/**
 * @Description: 响应工具类
 * @Author: admin
 * @Date: 2020/9/24 15:56
 */
public class ResponseUtil {

    public static BaseResponse success(){
        BaseResponse baseResponse = new BaseResponse<>();
        baseResponse.setCode("200");
        return baseResponse;
    }
    public static BaseResponse success(Object data){
        BaseResponse baseResponse = new BaseResponse<>();
        baseResponse.setCode("200");
        baseResponse.setData(data);
        return baseResponse;
    }

    public static  BaseResponse fail(String message){
        BaseResponse baseResponse = new BaseResponse<>();
        baseResponse.setCode("500");
        baseResponse.setMessage(message);
        return baseResponse;
    }
}
