package com.example.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * Created by ZHOUYAO on 2018/4/12.
 */
public class User {

    private String name;
    @JsonIgnore
    private String password;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "zh",timezone = "GMT+8")
    private Date birthday;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String  desc;

    public String getPassword() {
        return password;
    }

    public Integer getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {

        return name;
    }

}
