package com.czxy.mybatis_0929.mapper;

import com.czxy.mybatis_0929.domain.User;
import com.czxy.mybatis_0929.vo.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public interface UserMapper {
    /**
     * 条件查询
     * @param name
     * @return
     */
    public List<User> selectBySQL(@Param("name") String name);


    public List<User> condition(@Param("sex") String sex);


    public List<User> condition2(@Param("beginTime") String beginTime,@Param("endTime") String endTime);


    /*
    *
    forEach练习
    * */
    public List<User> condition3(UserVo userVo);
}