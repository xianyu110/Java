package com.czxy.ssm3.test;


import com.czxy.ssm3.domain.User;
import com.czxy.ssm3.mapper.UserMapper;
import com.czxy.ssm3.utils.MyBatisUtils_1;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author ChinaManor
 * #Description page
 * #Date: 27/9/2021 14:40
 */
public class page {
    /*1) 设置分页数据
PageHelper.startPage(int pageNum, int pageSize)
	参数1：pageNum 第几页
	参数2：pageSize 页面显示个数
2) 封装分页结果 PageInfo
	new PageInfo(查询结果)	  //创建分页对象
	pageInfo.getTotal(),	//自动查询总条数
	pageInfo.getPages(),	//总分页数*/
    public static void main(String[] args) {
        UserMapper mapper = MyBatisUtils_1.getMapper(UserMapper.class);
        //设置分页
        PageHelper.startPage(1,2);
        //查询
        List<User> users = mapper.selectAll();
        //封装
        PageInfo<User> pageInfo = new PageInfo<>(users);
        long total = pageInfo.getTotal();
        List<User> list = pageInfo.getList();
        System.out.println("总条数:"+total);
        System.out.println("分页数据:"+pageInfo.getPages());
        System.out.println("每页个数:"+pageInfo.getPageSize());
        System.out.println("当前页:"+pageInfo.getPageNum());
        System.out.println("是否上一页:"+pageInfo.isHasPreviousPage());
        System.out.println("是否下一页:"+pageInfo.isHasNextPage());
        list.forEach(user -> {
            System.out.println(user);
        });
        MyBatisUtils_1.commitAndclose();
    }
}
