package com.czxy.mybatis_0929.mapper;

import com.czxy.mybatis_0929.domain.Book;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ChinaManor
 * #Description BookMapper
 * #Date: 30/9/2021 18:07
 */
public interface BookMapper {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from book")
    @Results(value = {
            @Result(property = "bid", column = "bid"),
            @Result(property = "title", column = "title"),
            @Result(property = "price", column = "price"),
            @Result(property = "author", column = "author"),
            @Result(property = "cid", column = "cid", id = true),
    })
    public List<Book> selectAll();
}
