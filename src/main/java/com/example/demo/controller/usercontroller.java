package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.userservice;
import org.apache.ibatis.annotations.SelectProvider;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;

import java.util.List;
import java.util.logging.Logger;

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

  Logger logger= (Logger) LoggerFactory.getLogger(this.getClass());

  logger.info("这是info级别");



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
