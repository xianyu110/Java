package ssm.test;

import ssm.domain.Order;
import ssm.domain.User;
import ssm.mapper.OrderMapper;
import ssm.mapper.UserMapper;
import ssm.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public class Test_Utils {


    //一对多测试:
    @Test
    public void User(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void Order(){
        OrderMapper mapper = MyBatisUtils.getMapper(OrderMapper.class);

        Order ordersByUserId = mapper.findOrdersByUserId("u002");
        System.out.println(ordersByUserId.toString());
    }


/*
    //多对一测试:
    @Test
    public void User2(){
        UserMapper mapper = MyBatisUtils.getMapper(UserMapper.class);

        User u001 = mapper.selectById("u001");
        System.out.println(u001);

    }
    @Test
    public void Order2(){
        OrderMapper mapper = MyBatisUtils.getMapper(OrderMapper.class);
        Order x001 = mapper.selectById("x001");
        System.out.println(x001);
        List<User> users = mapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }*/
}