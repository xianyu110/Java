package com.czxy.ssm.mapper;

import com.czxy.ssm.domain.User;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public interface UserMapper {
    /**
     * 通过id查询详情
     * @param uid
     * @return
     */
    public User selectById(String uid);

    public List<User> selectAll();
}