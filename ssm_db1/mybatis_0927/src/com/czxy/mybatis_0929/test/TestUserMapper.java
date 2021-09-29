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
    public static void main(String[] args) {
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> list = mapper.selectBySQL("肉丝");
        list.forEach(System.out::println);
        MyBatisUtils.commitAndclose();
    }

    //    TODO 动态SQL
    @Test
    public void testSQL(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> list = mapper.selectBySQL("肉丝");

        list.forEach(System.out::println);
        MyBatisUtils.commitAndclose();
    }

    @Test
    public void testCondition(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> list = mapper.condition("男");

        list.forEach(System.out::println);
        MyBatisUtils.commitAndclose();
    }
    @Test
    public void testCondition2(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> list = mapper.condition2("2015-11-04","2025-11-04");
        list.forEach(System.out::println);
        MyBatisUtils.commitAndclose();
    }

    @Test
    public void testCondition3(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        UserVo userVo = new UserVo();

        List<User> list = mapper.condition3(userVo);
        list.forEach(System.out::println);
        MyBatisUtils.commitAndclose();
    }
}
