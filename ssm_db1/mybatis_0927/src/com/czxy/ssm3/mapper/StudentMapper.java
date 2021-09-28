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
    @Select("select * from ssm_db2.student s where s.sid in (select student_id from ssm_db2.course_student where course_id = #{cid} )")
    public Student findStudentByCourseId(@Param("cid") Integer cid) throws Exception;
}