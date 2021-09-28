package com.czxy.ssm.test;

import com.czxy.ssm.domain.User;
import com.czxy.ssm.mapper.UserMapper;
import com.czxy.ssm.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public class TestUserMapper {


    @Test
    public void testSelectById() {
        UserMapper userMapper = MyBatisUtils.getMapper(UserMapper.class);

        User user = userMapper.selectById("u001");
        System.out.println(user);

        MyBatisUtils.commitAndclose();
    }
    @Test
    public void testSelectAll() {
        UserMapper userMapper = MyBatisUtils.getMapper(UserMapper.class);

        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
        MyBatisUtils.commitAndclose();
    }
    @Test
    public void testAdd() {
        UserMapper userMapper = MyBatisUtils.getMapper(UserMapper.class);


        MyBatisUtils.commitAndclose();
    }
}
