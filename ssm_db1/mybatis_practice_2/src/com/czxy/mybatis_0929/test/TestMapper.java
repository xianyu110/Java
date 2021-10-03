package com.czxy.mybatis_0929.test;

import com.czxy.mybatis_0929.domain.Book;
import com.czxy.mybatis_0929.domain.Category;
import com.czxy.mybatis_0929.domain.User;
import com.czxy.mybatis_0929.mapper.BookMapper;
import com.czxy.mybatis_0929.mapper.CategoryMapper;
import com.czxy.mybatis_0929.mapper.UserMapper;
import com.czxy.mybatis_0929.utils.MyBatisUtils;
import com.czxy.mybatis_0929.vo.UserVo;
import org.junit.Test;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public class TestMapper {


    
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
    @Test
    public void testSelectById2() {

        /*
         * 一对多
         * */
        CategoryMapper categoryMapper = MyBatisUtils.getMapper(CategoryMapper.class);
        List<Category> cList = categoryMapper.selectAll();
            System.out.println(cList);

/*        BookMapper bookMapper = MyBatisUtils.getMapper(BookMapper.class);
        List<Book> books = bookMapper.selectAll();
        for (Book book : books) {
            System.out.println(book);
        }*/
//        MyBatisUtils.commitAndclose();
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
