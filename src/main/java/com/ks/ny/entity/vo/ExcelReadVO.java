package com.ks.ny.entity.vo;

import com.alibaba.excel.annotation.ExcelProperty;

public class ExcelReadVO {
    @ExcelProperty("姓名")
    String name;
    @ExcelProperty("年龄")
    Integer age;
    @ExcelProperty("地址")
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
