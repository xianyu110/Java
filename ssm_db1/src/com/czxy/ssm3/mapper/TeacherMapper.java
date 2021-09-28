package com.czxy.ssm3.mapper;

import com.czxy.ssm3.domain.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public interface TeacherMapper {

    @Select("select * from teacher t where t.cid =#{cid}")
    @Results(id = "tResult",value = {
            @Result(property = "cid",column = "cid"),
            @Result(property = "name",column = "name"),
            @Result(property = "cList",
                    many = @Many(select = "com.czxy.ssm3.mapper.StudentMapper.findStudentByTeacherId"),
                    column = "cid"),
    })
    public Teacher selectById(@Param("cid") Integer cid);

    /*
     * 根据学生id查对应的老师
     * */
    /**
     * 查询所有
     * @return
     */
    @Select("select * from teacher")
    @ResultMap("tResult")
    public List<Teacher> selectList();

}