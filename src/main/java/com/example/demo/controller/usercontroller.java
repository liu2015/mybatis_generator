package com.example.demo.controller;

import com.example.demo.service.userservice;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;

import java.util.List;

@Controller
public class usercontroller {
@Autowired
    userservice userservice;

@RequestMapping("/login1")
public String login(){

    return "login1";
}

@RequestMapping("/index")
    @SelectProvider(type = BaseSelectProvider.class, method = "dynamicSQL")
    public String select(User user) {

  System.out.println(user.toString());
    List dd= (List) userservice.select(user);

    System.out.println("ceshi"+dd.toString());
    if (dd.isEmpty()) {

        return "login1";

    }
    else {

        return "login";
    }
}

}
