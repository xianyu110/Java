package com.czxy.ssm.mapper;

import com.czxy.ssm.domain.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author  manor的大数据之路
 *  
 */
public interface OrderMapper {

    /**
     * 查询指定用户的所有的订单
     * @param uid
     * @return
     */
    public Order findOrdersByUserId(@Param("uid") Integer uid) ;

    /*
    *
    * */
    public Order selectById(@Param("oid") String oid);
}