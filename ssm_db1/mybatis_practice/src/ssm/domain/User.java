package ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    private String uid;
    private String username;
    private String password;
    private String name;
    private String email;
    private Date birthday;
    private String sex;
    private Integer state;
    private String code;
    // 一对多：一个订单 拥有【多个用户】
    private List<Order> orderList = new ArrayList<>();
    // ...

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", state=" + state +
                ", code='" + code + '\'' +
                ", orderList=" + orderList +
                '}';
    }

    public User() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public User(String uid, String username, String password, String name, String email, Date birthday, String sex, Integer state, String code, List<Order> orderList) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.state = state;
        this.code = code;
        this.orderList = orderList;
    }
}
