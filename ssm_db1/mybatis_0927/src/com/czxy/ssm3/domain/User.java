package com.czxy.ssm3.domain;

import javax.persistence.Id;

/**
 *
 Create Table

 CREATE TABLE `user` (
 `uid` varchar(32) NOT NULL,
 `username` varchar(20) DEFAULT NULL,
 `password` varchar(20) DEFAULT NULL,
 `name` varchar(20) DEFAULT NULL,
 `email` varchar(30) DEFAULT NULL,
 `birthday` date DEFAULT NULL,
 `sex` varchar(10) DEFAULT NULL,
 `state` int(11) DEFAULT NULL,
 `code` varchar(64) DEFAULT NULL,
 PRIMARY KEY (`uid`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8

 */

public class User {
    @Id
    private String uid;
    private String username;
    private String password;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }

    public User(String uid, String username, String password, String email) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
