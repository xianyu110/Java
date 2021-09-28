package ssm.test;

import ssm.domain.User;
import ssm.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ChinaManor
 * #Description T1_SelectAll
 * #Date: 25/9/2021 20:16
 */
public class T1_SelectAll {
    public static void main(String[] args) throws IOException {
        //1. 加载配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2 获得工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //3 通过工程获得连接
        SqlSession session = factory.openSession();
        //4 获得功能接口
        UserMapper mapper = session.getMapper(UserMapper.class);
        //5 进行查询
        List<User> users = mapper.selectAll();
        //6 处理数据
        for (User user : users) {
            System.out.println(user);
        }
        //7 释放资源
        session.close();
    }
}
