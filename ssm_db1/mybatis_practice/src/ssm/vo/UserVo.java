package ssm.vo;

/**
 * @author  manor的大数据之路
 *  
 */
public class UserVo {
    private String beginTime;       // 开始时间
    private String endTime;         // 结束时间

    public UserVo() {
    }

    public UserVo(String beginTime, String endTime) {
        this.beginTime = beginTime;
        this.endTime = endTime;
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
}