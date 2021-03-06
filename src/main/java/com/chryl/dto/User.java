package com.chryl.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Created by Chryl on 2019/10/15.
 */
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = -126376395371096706L;
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    @TableField(value = "user_name")
    @NotBlank(message="用户名不能为空")
    private String userName;

    @TableField(value = "user_password")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)//只允许修改,不允许读(展示)
    private String userPassowrd;

    @TableField(value = "is_admin")
    private Boolean isAdmin;

    public User() {
    }

    public User(@NotBlank(message = "用户名不能为空") String userName, String userPassowrd) {
        this.userName = userName;
        this.userPassowrd = userPassowrd;
    }

    public User(String id, String userName, String userPassowrd) {
        this.id = id;
        this.userName = userName;
        this.userPassowrd = userPassowrd;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassowrd() {
        return userPassowrd;
    }

    public void setUserPassowrd(String userPassowrd) {
        this.userPassowrd = userPassowrd;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassowrd='" + userPassowrd + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
