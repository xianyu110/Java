package com.czxy.mybatis_0929.mapper;

import com.czxy.mybatis_0929.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public interface StudentMapper {

    /*
    * 所有学生
    * */
    public List<Student> selectAll();
}