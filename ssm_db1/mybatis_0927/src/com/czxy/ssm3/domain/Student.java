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

    private List<Course> cList = new ArrayList<>();

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", cList=" + cList +
                '}';
    }

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

    public List<Course> getcList() {
        return cList;
    }

    public void setcList(List<Course> cList) {
        this.cList = cList;
    }

    public Student() {
    }

    public Student(Integer sid, String name, List<Course> cList) {
        this.sid = sid;
        this.name = name;
        this.cList = cList;
    }
}