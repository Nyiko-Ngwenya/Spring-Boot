package com.example.firstproject.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

//
@Entity
@Table
public class AppUser {
    @Id
    private UUID id = UUID.randomUUID();
    private String userName;
    private String password;
    private String email;

    public AppUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

//    OAuth 2.0

    public AppUser() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
