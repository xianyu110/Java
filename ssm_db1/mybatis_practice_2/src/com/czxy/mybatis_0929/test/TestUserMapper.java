package com.czxy.mybatis_0929.test;

import com.czxy.mybatis_0929.domain.Order;
import com.czxy.mybatis_0929.domain.Student;
import com.czxy.mybatis_0929.domain.Teacher;
import com.czxy.mybatis_0929.domain.User;
import com.czxy.mybatis_0929.mapper.OrderMapper;
import com.czxy.mybatis_0929.mapper.StudentMapper;
import com.czxy.mybatis_0929.mapper.TeacherMapper;
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



    @Test
    public void testSelectById() {

        /*
         * 一对多
         * */
        UserMapper userMapper = MyBatisUtils.getMapper(UserMapper.class);

        User user = userMapper.selectById("u001");
        System.out.println(user);

//        MyBatisUtils.commitAndclose();


      /*
      *  多对一
      * */
     /*   OrderMapper orderMapper = MyBatisUtils.getMapper(OrderMapper.class);

        Order order = orderMapper.selectById("x001");
        System.out.println(order);

        MyBatisUtils.commitAndclose();*/
    }


    /*
     *TODO  多对多
     * */
    @Test
    public void test(){
        //1 获得mapper
        StudentMapper studentMapper = MyBatisUtils.getMapper(StudentMapper.class);

        //2 查询素有
        List<Student> list = studentMapper.selectAll();
        list.forEach(System.out::println);

        //3 释放
//        MyBatisUtils.commitAndclose();
    };    @Test
    public void test2(){
        //1 获得mapper
        TeacherMapper teacherMapper = MyBatisUtils.getMapper(TeacherMapper.class);

        //2 查询素有
        List<Teacher> list = teacherMapper.selectAllBySid(1);
        list.forEach(System.out::println);

        //3 释放
        MyBatisUtils.commitAndclose();
    };



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
    public void testselectByName() {
        UserMapper userMapper = MyBatisUtils.getMapper(UserMapper.class);
        userMapper.selectByName("rose");

        MyBatisUtils.commitAndclose();
    }
    @Test
    public void testinsert(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);

        User user = new User();
        user.setUid("1");
        user.setUsername("jack");
        user.setName("杰克");

        Integer result = mapper.insert(user);

        // 打印
        System.out.println(result);

        MyBatisUtils.commitAndclose();
    }

    @Test
    public void testUpdate() {
        UserMapper UserMapper = MyBatisUtils.getMapper(UserMapper.class);

        User user = new User();
        user.setUid("3");
        user.setUsername("jack2");
        user.setName("杰克2222");

        int result = UserMapper.updateByPrimaryKey(user);

        // 打印
        System.out.println(result);

        MyBatisUtils.commitAndclose();
    }

    @Test
    public void testDelete() {
        UserMapper UserMapper = MyBatisUtils.getMapper(UserMapper.class);

        int result = UserMapper.deleteByPrimaryKey("3");

        // 打印
        System.out.println(result);

        MyBatisUtils.commitAndclose();
    }

//    TODO 动态SQL
@Test
public void testSQL(){
    UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
    List<User> list = mapper.selectBySQL("u001");

    list.forEach(System.out::println);
    MyBatisUtils.commitAndclose();
}

    @Test
    public void testCondition(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        UserVo userVo = new UserVo();
        userVo.setName("杰克");
        userVo.setPassword("123");
        List<User> list = mapper.condition(userVo);
        list.forEach(System.out::println);
        MyBatisUtils.commitAndclose();
    }

    @Test
    public void  testAll(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testCount(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        Long aLong = mapper.countUser();
        System.out.println(aLong);
    }
}
