package com.onion.controller;

import com.onion.entity.SysUser;
import com.onion.service.Impl.SysUserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by lhd on 2017/5/4.
 * 系统用户controller
 */
@Controller
@RequestMapping(value = "/user")
public class SysUserController {
    Logger logger = LoggerFactory.getLogger(SysUserController.class);

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
    public String test(HttpServletRequest request, HttpServletResponse response){
        try {
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        logger.info("info","test1");
        return "test";
    }
}
