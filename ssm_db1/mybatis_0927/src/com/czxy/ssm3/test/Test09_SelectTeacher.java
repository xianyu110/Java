package com.czxy.ssm3.test;

import com.czxy.ssm3.domain.Course;
import com.czxy.ssm3.mapper.CourseMapper;
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
        CourseMapper courseMapper = MyBatisUtils_1.getMapper(CourseMapper.class);

        Course course = courseMapper.selectById(1);
        // 打印
        System.out.println(course);

        MyBatisUtils_1.commitAndclose();
    }


    @Test
    public void ts3(){
        CourseMapper teacherMapper = MyBatisUtils_1.getMapper(CourseMapper.class);

        List<Course> courses = teacherMapper.selectList();
        courses.forEach(course -> {
            System.out.println(courses);
        });

        MyBatisUtils_1.commitAndclose();
    }
}