package com.yt.controller;

import com.yt.pojo.User;
import com.yt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAllUser")
    public String findAllUser(Model model){
        List<User> list=userService.findAllUser();
        model.addAttribute("list",list);
        return "AllUser";
    }
}