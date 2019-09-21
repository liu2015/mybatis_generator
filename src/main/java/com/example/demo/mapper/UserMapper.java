package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.MyMapper;
@Repository
public interface UserMapper extends MyMapper<User> {
}