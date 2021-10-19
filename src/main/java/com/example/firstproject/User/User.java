package com.example.firstproject.User;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    @NotNull
    @Size(min = 2, max = 30)
    private String password;

    @NotNull
    @Min(18)
    private String userName;

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}