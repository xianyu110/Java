package com.czxy.ssm3.mapper;

import com.czxy.ssm3.domain.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public interface CourseMapper {

    @Select("select * from ssm_db2.course c where c.cid =#{cid}")
    @Results(id = "cResult",value = {
            @Result(property = "cid",column = "cid"),
            @Result(property = "name",column = "name"),
            @Result(property = "sList",
                  many = @Many(select = "com.czxy.ssm3.mapper.StudentMapper.findStudentByCourseId"),
                    column = "cid"),
    })
    public Course selectById(@Param("cid") Integer cid);

/*    *//*
     * 根据学生id查对应的老师
     * *//*
    *//**
     * 查询所有
     * @return
     */
    @Select("select * from course")
    @ResultMap("cResult")
    public List<Course> selectList();

}