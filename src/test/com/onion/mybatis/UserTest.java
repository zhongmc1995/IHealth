package com.onion.mybatis;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.onion.entity.SysUser;
import com.onion.service.Impl.SysUserServiceImpl;
import com.sun.org.apache.xml.internal.security.algorithms.Algorithm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by zhongmc on 2017/5/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/applicationContext-dao.xml",
        "classpath:config/spring/applicationContext-service.xml"})
public class UserTest {


    @Autowired SysUserServiceImpl sysUserService;

    /**
     * 插入测试
     */
    @Test
    public void insertUser(){
        SysUser user = new SysUser();
        user.setUsername("zhangsan");
        user.setPassword("zhangsan");
        sysUserService.insert(user);
    }

    /**
     * 查询单个测试
     */
    @Test
    public void selectUser(){
        SysUser user = new SysUser();
        user.setUsername("zhangsan");
        Wrapper wrapper = new EntityWrapper(user);
        SysUser sysUser = sysUserService.selectOne(wrapper);
        System.out.println(sysUser);
    }

    /**
     * 查询全部测试
     */
    @Test
    public void selectUserList(){
        Wrapper wrapper = new EntityWrapper();
        wrapper.groupBy("username");
        Date date = new Date();
        date.getTime();
        List<SysUser> list = sysUserService.selectList(wrapper);
        for (SysUser s : list){
            System.out.println(s);
        }

    }

    /**
     * 删除测试
     */
    @Test
    public void deleteUser(){

        /**
         * 主键删除
         */
        SysUser user = new SysUser();
        user.setUsername("zhangsan");
        Wrapper wrapper = new EntityWrapper(user);
        SysUser sysUser = sysUserService.selectOne(wrapper);
        sysUserService.deleteById(sysUser.getId());


    }

    /**
     * 根据任何属性删除
     */
    @Test
    public void deleteUserKey(){
        SysUser user = new SysUser();
        user.setUsername("zhangsan");
        Wrapper wrapper = new EntityWrapper();
        wrapper.and("password","1234");
        sysUserService.delete(wrapper);
    }

    /**
     * 更新用户
     */
    @Test
    public void updateUser(){
        SysUser user = new SysUser();
        user.setUsername("zhangsan");
        Wrapper wrapper = new EntityWrapper();
//        sysUserService.update();
    }

}
