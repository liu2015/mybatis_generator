package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.MyMapper;
//@Repository
//@Mapper
public interface UserMapper extends MyMapper<User> {
}