package ssm.mapper;

import ssm.domain.Order;

/**
 * @author  manor的大数据之路
 *  
 */

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author  manor的大数据之路
 *
 */
public interface OrderMapper {

    /**
     * 通过id查询详情
     * @param uid
     * @return
     */
    @Select("select * from orders where uid = #{uid}")
    public Order findOrdersByUserId(@Param("uid") String uid) ;

}