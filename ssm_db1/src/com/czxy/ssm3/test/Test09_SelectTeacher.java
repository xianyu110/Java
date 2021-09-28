package com.czxy.ssm3.test;

import com.czxy.ssm3.domain.Student;
import com.czxy.ssm3.domain.Teacher;
import com.czxy.ssm3.mapper.TeacherMapper;
import com.czxy.ssm3.utils.MyBatisUtils_1;
import org.junit.Test;

import java.util.List;

/**
 * @author  manor的大数据之路
 *  
 */
public class Test09_SelectTeacher {

    @Test
    public void ts(){
        TeacherMapper teacherMapper = MyBatisUtils_1.getMapper(TeacherMapper.class);

        Teacher teacher = teacherMapper.selectById(1);
        // 打印
        System.out.println(teacher);

        MyBatisUtils_1.commitAndclose();
    }

    @Test
    public void ts2(){
        Student mapper = MyBatisUtils_1.getMapper(Student.class);
        List<Teacher> tList = mapper.gettList();
        for (Teacher teacher : tList) {
            System.out.println(teacher);
        }
    }

    @Test
    public void ts3(){
        TeacherMapper teacherMapper = MyBatisUtils_1.getMapper(TeacherMapper.class);

        List<Teacher> teachers = teacherMapper.selectList();
        teachers.forEach(teacher -> {
            System.out.println(teacher);
        });

        MyBatisUtils_1.commitAndclose();
    }
}