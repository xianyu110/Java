package com.czxy.mybatis_0929.test;

import com.czxy.mybatis_0929.domain.Order;
import com.czxy.mybatis_0929.domain.User;
import com.czxy.mybatis_0929.mapper.OrderMapper;
import com.czxy.mybatis_0929.mapper.UserMapper;
import com.czxy.mybatis_0929.utils.MyBatisUtils;
import com.czxy.mybatis_0929.vo.UserVo;
import org.junit.Test;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public class TestUserMapper {
    //    TODO 动态SQL
    public static void main(String[] args) {
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> list = mapper.selectBySQL("肉丝","女","2000-01-01","2020-01-01");
        list.forEach(System.out::println);
        MyBatisUtils.commitAndclose();
    }



}
