package com.ks.ny.entity.vo;

public class ResultDate<T> {
    private Integer code;
    private String msg;

    private T Date;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getDate() {
        return Date;
    }

    public void setDate(T date) {
        Date = date;
    }

    public ResultDate(Integer code, String msg, T date) {
        this.code = code;
        this.msg = msg;
        Date = date;
    }

    public ResultDate(T date) {
        this.code = ResultCode.SUCCEED.getCode();
        this.msg = ResultCode.SUCCEED.getMsg();
        Date = date;
    }
    public static <T> ResultDate<T> success(T date){
        return new ResultDate<T>(date);
    }

    public static <T> ResultDate<T> other(ResultCode resultCode,T date){
        return new ResultDate<T>(resultCode.getCode(),resultCode.getMsg(),date);
    }
}
