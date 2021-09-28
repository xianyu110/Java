package com.czxy.ssm3.mapper;

import com.czxy.ssm3.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author  manor的大数据之路
 *  
 */
public interface StudentMapper {
    /**
     * 通过cid查询对应的学生
     * @param cid
     * @return
     * @throws Exception
     */
    @Select("select * from student s where s.sid in (select student_id from teacher_student where teacher_id = #{cid} )")
    public Student findStudentByTeacherId(@Param("cid") Integer cid) throws Exception;
}