package cn.itcast.controller;

import cn.itcast.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class UserController {
    @Reference
    private UserService userService;
    @RequestMapping("showName")
    @ResponseBody
    public String showName(){
        return userService.getName();
    }
}