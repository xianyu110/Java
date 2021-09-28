package com.czxy.ssm3.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * #学生表
 * CREATE TABLE student(
 *  sid INT PRIMARY KEY,
 *  NAME VARCHAR(50)
 * );
 * @author  manor的大数据之路
 *  
 */
public class Student {
    private Integer sid;
    private String name;

    private List<Teacher> tList = new ArrayList<>();

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> gettList() {
        return tList;
    }

    public void settList(List<Teacher> tList) {
        this.tList = tList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", tList=" + tList +
                '}';
    }
}