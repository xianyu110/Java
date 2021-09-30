package com.czxy.mybatis_0929.mapper;

import com.czxy.mybatis_0929.domain.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public interface TeacherMapper {
    /**
     * 查询指定学生的所有授课老师
     * @return
     */
    public List<Teacher> selectAllBySid(@Param("sid") Integer sid);
}