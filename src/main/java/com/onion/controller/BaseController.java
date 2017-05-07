package com.onion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lhd on 2017/5/7.
 */
@Controller
@RequestMapping("/")
public class BaseController {

    @RequestMapping(value = {"","index"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }

}
