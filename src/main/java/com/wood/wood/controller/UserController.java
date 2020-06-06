package com.wood.wood.controller;

import com.alibaba.fastjson.JSON;
import com.wood.wood.entity.Tuser;
import com.wood.wood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController{

    @Autowired
    private UserService userService;

    /**
     * 查询所有记录
     * @return
     */
    @RequestMapping("/getUserList")
    public String getUserList() {
        List<Tuser> tuserList= userService.getUserList();
        return JSON.toJSONString(tuserList);
    }

    /**
     * 根据id更新password
     */
    @RequestMapping("updateForId")
    public void updateForId(HttpServletRequest request){
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        userService.updateForId(id,pwd);
    }
}
