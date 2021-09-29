package com.czxy.mybatis_0928.mapper;

import com.czxy.mybatis_0928.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author ChinaManor
 * #Description productMapper
 * #Date: 25/9/2021 20:16
 */
public interface UserMapper extends Mapper<User> {
    /**
     * 查询所有
     * @return
     */
//    @Override
    @Select("select * from user")
    public List<User>  selectAll();

    @Select("select * from user")
    public List<User>  selectAll2();

    /**
     * 通过id查询详情
     * @param uid
     * @return
     */
    public User selectById(String uid);
}
