package com.czxy.mybatis_0929.mapper;

import com.czxy.mybatis_0929.domain.Book;
import com.czxy.mybatis_0929.domain.Category;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author ChinaManor
 * #Description CategoryMapper
 * #Date: 30/9/2021 18:07
 */
public interface CategoryMapper  {

    /*
    *  查询所有
    * */
    @Select("select * from category c ")
    @Results(value = {
            @Result(property = "cid", column = "cid",id = true),
            @Result(property = "cname", column = "cname"),
            @Result(property = "parent_id", column = "parent_id"),
            @Result(property = "author", column = "author"),
            @Result(property = "desc", column = "desc"),

            @Result(property="categories" , many=@Many(select="com.czxy.mybatis_0929.mapper.CategoryMapper.selectAll2")
                    , column="cid"),
                       @Result(property="books" , many=@Many(select="com.czxy.mybatis_0929.mapper.BookMapper.selectAll")
                    , column="cid"),
    })
    public List<Category> selectAll();
    /*
     *  查询所有
     * */
    @Select("select * from category where cid =#{parent_id}")
    public List<Category> selectAll2(@Param("parent_id")String parent_id);

}
