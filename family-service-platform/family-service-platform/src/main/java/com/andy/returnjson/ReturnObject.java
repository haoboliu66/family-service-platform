package com.andy.returnjson;

/**
 * @author andy-liu
 * @date 2020/8/23 - 9:55 AM
 */

/**
 * data format required by web project: code, message, result
 */

public class ReturnObject {

    private Integer code;
    private String message;
    private Object result;

    {
        code = 200;
        message = "";
    }

    public ReturnObject() {

    }

    public ReturnObject(String message, Object result) {
        this.message = message;
        this.result = result;
    }

    public ReturnObject(Object result) {
        this(200, "", result);
    }

    public ReturnObject(Integer code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getResult() {
        return result;
    }
}
