package com.czxy.mybatis_0928.test;

import com.czxy.mybatis_0928.domain.User;
import com.czxy.mybatis_0928.mapper.UserMapper;
import com.czxy.mybatis_0928.mapper.UserMapper2;
import com.czxy.mybatis_0928.utils.MyBatisUtils;
import com.czxy.mybatis_0928.utils.MyBatisUtils_1;
import org.junit.Test;

import java.util.List;

/**
 * @author ChinaManor
 * #Description Test13_Mapper
 * #Date: 27/9/2021 17:43
 */
public class Test13_Mapper {
    @Test
    public void testAll(){
        UserMapper2 mapper = MyBatisUtils.getMapper(UserMapper2.class);
        List<User> users = mapper.selectAll();
        for (User user : users) {
            System.out.println(user);

        }
    }

    @Test
    public void testAll2(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }

    }
    @Test
    public void testAll3(){
        UserMapper mapper = MyBatisUtils_1.getMapper(UserMapper.class);

        User user = mapper.selectById("1");
        System.out.println(user);


    }

}
