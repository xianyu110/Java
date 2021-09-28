package com.czxy.ssm.mapper;

import com.czxy.ssm.domain.User;
import com.czxy.ssm.vo.UserVo;
import org.apache.ibatis.annotations.Param;

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

    /*
    * 查询所有
    * */
    public List<User> selectAll();

    /*
    * 模糊查询
    * @param name*/
    public List<User> selectByName(@Param("username") String name);

    /**
     * 插入数据
     * @param user
     */
    public Integer insert(User user);

    /**
     * 修改数据
     * @param user
     */
    public Integer updateByPrimaryKey(User user);

    /**
     * 通过id删除
     * @param uid
     */
    public Integer deleteByPrimaryKey(@Param("uid") String uid);

    /**
     * 条件查询
     * @param userVo
     * @return
     */
    public List<User> condition(UserVo userVo);
}