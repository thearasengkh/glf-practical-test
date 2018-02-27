package com.glf.practicaltest.controller.rest.response;

/**
 * @author Theara Seng
 * Created on 27 Feb, 2018
 */

public abstract class AbstractResponse {

    private String code;
    private String msg;

    public AbstractResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
