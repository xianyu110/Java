package com.czxy.ssm.vo;

/**
 * @author  manor的大数据之路
 *  
 */
public class UserVo {
    private String name;
    private String beginTime;       // 开始时间
    private String endTime;         // 结束时间

    @Override
    public String toString() {
        return "UserVo{" +
                "name='" + name + '\'' +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public UserVo(String name, String beginTime, String endTime) {
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }
}