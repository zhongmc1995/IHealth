package com.onion.controller;

import com.onion.entity.SysUser;
import com.onion.service.Impl.SysUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lhd on 2017/5/4.
 * 系统用户controller
 */
@Controller
@RequestMapping(value = "/user")
public class SysUserController {

    @Autowired
    private SysUserServiceImpl sysUserService;

    /**
     * json测试
     * @param sysUser
     */
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public void insertSysUser(SysUser sysUser){
        sysUserService.insert(sysUser);
    }

    /**
     * 视图返回测试
     * @return
     */
    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
