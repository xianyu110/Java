package ssm.mapper;

import ssm.domain.User;
import org.apache.ibatis.annotations.*;

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
    @Results(id = "userResult", value = {
            @Result(property = "uid", column = "uid", id = true),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property="orderList" , many=@Many(select="OrderMapper.findOrdersByUserId"), column="uid")
    })
    public List<User> selectAll();

}