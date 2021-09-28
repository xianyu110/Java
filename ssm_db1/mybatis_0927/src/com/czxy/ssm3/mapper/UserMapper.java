package com.czxy.ssm3.mapper;

import com.czxy.ssm3.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ChinaManor
 * #Description productMapper
 * #Date: 25/9/2021 20:16
 */
public interface UserMapper {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from user")
    public List<User>  selectAll();

    /*
     * 查询部分*/

    @Select("select * from user where username like '%${username}' and password like '%${password}'")
    public List<User> selectByNameAndPassword(@Param("username") String name, @Param("password") String password);
}
