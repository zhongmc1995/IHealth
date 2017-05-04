package com.onion.mybatis;

import com.onion.entity.SysUser;
import com.onion.mapper.SysUserMapper;
import com.onion.service.ISysUserService;
import com.onion.service.Impl.SysUserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zhongmc on 2017/5/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring/applicationContext-dao.xml",
        "classpath:config/spring/applicationContext-service.xml"})
public class UserTest {

    @Autowired SysUserServiceImpl sysUserService;

    @Test
    public void testUser(){
        SysUser user = new SysUser();
        user.setUsername("zhangsan");
        user.setPassword("zhangsan");
        sysUserService.insert(user);
    }
}
