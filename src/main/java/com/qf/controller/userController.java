package com.qf.controller;

import com.qf.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/userController")
public class userController {

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser(){
        List<User> userList = new ArrayList();
        for (int i = 0 ; i < 10 ; i ++) {
            User u = new User(1+i , "aa"+i , "CC"+i);
            userList.add(u);
        }
        return userList;
    }

    @PostMapping(value = "/loginUser")
    public String loginUser(@RequestBody User user){
        if (user.getUname().equals("111") && user.getUpass().equals("111")){
            return "成功";
        } else {
            return "失败";
        }
    }
}
