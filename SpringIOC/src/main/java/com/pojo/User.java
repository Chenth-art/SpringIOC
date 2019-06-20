package com.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")//"user" 相当于bean里的id
public class User {
    @Value("1")//value是赋值 只识别字符串
    private Integer id;
    @Value("张三丰")
    private String uname;
    @Value("123")
    private String upass;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                '}';
    }

    public User(Integer id, String uname) {
        this.id = id;
        this.uname = uname;
    }

    public User(Integer id, String uname, String upass) {
        this.id = id;
        this.uname = uname;
        this.upass = upass;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}
