package com.example.role.entitis;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    @Id
    private Integer id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "passWord")
    private String passWord;

    private boolean enable;


    @Column(name = "createTime", updatable = false)
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", enable=" + enable +
                ", createTime=" + createTime +
                '}';
    }
}
