package com.czxy.mybatis_0929.domain;

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
public class Teacher {
    private Integer cid;
    private String name;

    private List<Student> cList = new ArrayList<>();

    public Integer getcid() {
        return cid;
    }

    public void setcid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getcList() {
        return cList;
    }

    public void setcList(List<Student> cList) {
        this.cList = cList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", cList=" + cList +
                '}';
    }
}