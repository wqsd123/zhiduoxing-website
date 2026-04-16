package com.zhiduoxing.common;

import lombok.Data;

import java.io.Serializable;


@Data
public class Result<T> implements Serializable {
    // 状态码：200=成功，400=参数错误，500=服务器错误
    private Integer code;
    // 提示信息
    private String message;
    // 响应数据（可选，如查询结果、新增记录ID）
    private T data;
    // 是否成功
    private Boolean success;

    // 成功响应（无数据）
    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("操作成功");
        result.setSuccess(true);
        return result;
    }

    // 成功响应（有数据）
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMessage("操作成功");
        result.setData(data);
        result.setSuccess(true);
        return result;
    }

    // 失败响应
    public static <T> Result<T> fail(String message) {
        Result<T> result = new Result<>();
        result.setCode(400);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }

    // 服务器错误响应
    public static <T> Result<T> error(String message) {
        Result<T> result = new Result<>();
        result.setCode(500);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }
}
