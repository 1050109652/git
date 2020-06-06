package com.wood.wood.service;

import com.wood.wood.entity.Tuser;
import com.wood.wood.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public  List<Tuser> getUserList() {
        return userMapper.getUserList();
    }

    public void updateForId(String id, String pwd) {
        userMapper.updateForId(id,pwd);
    }
}
