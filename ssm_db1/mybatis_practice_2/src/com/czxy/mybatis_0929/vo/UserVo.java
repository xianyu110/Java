package com.czxy.mybatis_0929.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public class UserVo {
   private List<String> ids =new ArrayList<>();

    private String name;
    private String password;
    private String beginTime;       // 开始时间
    private String endTime;         // 结束时间

    @Override
    public String toString() {
        return "UserVo{" +
                "ids=" + ids +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public UserVo() {
    }

    public UserVo(List<String> ids, String name, String password, String beginTime, String endTime) {
        this.ids = ids;
        this.name = name;
        this.password = password;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }
}