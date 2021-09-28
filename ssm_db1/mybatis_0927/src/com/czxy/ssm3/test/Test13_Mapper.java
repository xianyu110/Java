package com.czxy.ssm3.test;

import com.czxy.ssm3.domain.User;
import com.czxy.ssm3.mapper.UserMapper2;
import com.czxy.ssm3.utils.MyBatisUtils;
import org.junit.Test;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author ChinaManor
 * #Description Test13_Mapper
 * #Date: 27/9/2021 17:43
 */
public class Test13_Mapper {
    @Test
    public void testById(){
        UserMapper2 mapper = MyBatisUtils.getMapper(UserMapper2.class);
        User user = mapper.selectByPrimaryKey("u001");
        System.out.println(user);
    }
    @Test
    public void testAll(){
        UserMapper2 mapper = MyBatisUtils.getMapper(UserMapper2.class);
        List<User> users = mapper.selectAll();
        for (User user : users) {
        System.out.println(user);

        }
    }

    @Test
    public void testInsert(){
        UserMapper2 mapper = MyBatisUtils.getMapper(UserMapper2.class);

        //2 添加
        User user = new User();
        user.setUid("u002");
        user.setUsername("1");
        mapper.insertSelective(user);
        MyBatisUtils.commitAndclose();
    }

    @Test
    public void testUpdate(){
        UserMapper2 mapper = MyBatisUtils.getMapper(UserMapper2.class);

        //2 修改
        User user = new User();
        user.setUid("u001");
        user.setUsername("emooooooooooo");
        mapper.updateByPrimaryKey(user);
        MyBatisUtils.commitAndclose();
    }


    @Test
    public void testDelete(){
        UserMapper2 mapper = MyBatisUtils.getMapper(UserMapper2.class);

        //2 删除
        User user = new User();
        user.setUid("u005");
//        user.setUsername("emooooooooooo");
        mapper.deleteByPrimaryKey(user);
        MyBatisUtils.commitAndclose();
    }
    @Test
    public void testCondition(){
        //1 获得mapper
        UserMapper2 mapper = MyBatisUtils.getMapper(UserMapper2.class);

        //条件
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andNotEqualTo("uid","u001");

        List<User> users = mapper.selectByExample(example);
        users.forEach(user -> {
            System.out.println(user);
        });
    }

}
