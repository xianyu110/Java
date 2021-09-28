package ssm.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author  manor的大数据之路
 *  
 */
public class MyBatisUtils {

    // 会话工厂
    private static SqlSessionFactory factory;
    static{
        try {
            // 1.1 加载核心配置文件
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
            // 1.2 获得工厂
            factory = new SqlSessionFactoryBuilder().build(is);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static ThreadLocal<SqlSession> local = new ThreadLocal<>();

    /**
     * 获得新会话
     * @return
     */
    private static SqlSession openSession(){
        SqlSession sqlSession = local.get();
        if(sqlSession == null){
            sqlSession = factory.openSession();
            local.set(sqlSession);
        }
        return sqlSession;
    }

    /**
     * 获得mapper
     * @param clazz
     * @return
     */
    public static <T> T getMapper(Class<T> clazz){
        return openSession().getMapper(clazz);
    }

    /**
     * 释放资源
     */
    public static void close() {
        SqlSession sqlSession = openSession();
        if(sqlSession != null){
            sqlSession.close();
        }
    }

    /**
     * 提交并释放资源
     */
    public static void commitAndclose() {
        SqlSession sqlSession = openSession();
        if(sqlSession != null){
            sqlSession.commit();
            close();
        }
    }

    /**
     * 回滚并释放资源
     */
    public static void rollbackAndclose() {
        SqlSession sqlSession = openSession();
        if(sqlSession != null){
            sqlSession.rollback();
            close();
        }
    }

}