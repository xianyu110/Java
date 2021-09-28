package com.czxy.ssm3.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.entity.Config;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

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

            //创建一个MapperHelper
            MapperHelper mapperHelper = new MapperHelper();
            //特殊配置
            Config config = new Config();
            // 设置UUID生成策略
            // 配置UUID生成策略需要使用OGNL表达式
            // 默认值32位长度:@java.util.UUID@randomUUID().toString().replace("-", "")
            //config.setUUID("");
            // 主键自增回写方法,默认值MYSQL,详细说明请看文档
//	        config.secidENTITY("HSQLDB");
            // 支持方法上的注解
            // 3.3.1版本增加
            config.setEnableMethodAnnotation(true);
            config.setNotEmpty(true);
            // 序列的获取规则,使用{num}格式化参数，默认值为{0}.nextval，针对Oracle
            // 可选参数一共3个，对应0,1,2,分别为SequenceName，ColumnName, PropertyName
            //config.setSeqFormat("NEXT VALUE FOR {0}");
            // 设置全局的catalog,默认为空，如果设置了值，操作表时的sql会是catalog.tablename
            //config.setCatalog("");
            // 设置全局的schema,默认为空，如果设置了值，操作表时的sql会是schema.tablename
            // 如果同时设置了catalog,优先使用catalog.tablename
            //config.setSchema("");
            // 主键自增回写方法执行顺序,默认AFTER,可选值为(BEFORE|AFTER)
            //config.setOrder("AFTER");
            //设置配置
            mapperHelper.setConfig(config);
            // 注册通用tk.mybatis.mapper.common.Mapper接口 - 可以自动注册继承的接口
            mapperHelper.registerMapper(Mapper.class);
            mapperHelper.registerMapper(MySqlMapper.class);
//	        mapperHelper.registerMapper(SqlServerMapper.class);
//	        mapperHelper.registerMapper(IdsMapper.class);
            //配置完成后，执行下面的操作
            mapperHelper.processConfiguration(sqlSession.getConfiguration());


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