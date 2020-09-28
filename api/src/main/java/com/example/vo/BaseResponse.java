package com.example.vo;

import lombok.Data;

/**
 * @Description: 统一响应格式
 * @Author: admin
 * @Date: 2020/9/24 15:43
 */
@Data
public class BaseResponse <T> {

    private String code;

    private String message;

    private T data;

}
