package com.czxy.ssm3.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * #老师表
 * CREATE TABLE teacher(
 *  cid INT PRIMARY KEY,
 *  NAME VARCHAR(50)
 * );
 * @author  manor的大数据之路
 *  
 */
public class Course {
    private Integer cid;
    private String name;

    private List<Student> sList = new ArrayList<>();

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", sList=" + sList +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getsList() {
        return sList;
    }

    public void setsList(List<Student> sList) {
        this.sList = sList;
    }

    public Course() {
    }

    public Course(Integer cid, String name, List<Student> sList) {
        this.cid = cid;
        this.name = name;
        this.sList = sList;
    }
}