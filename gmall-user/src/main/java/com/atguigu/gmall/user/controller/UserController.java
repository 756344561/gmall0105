package com.atguigu.gmall.user.controller;


import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMerbers = userService.getAllUser();
        return umsMerbers;
    }

    @RequestMapping("getMemberByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getMemberByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = userService.getMemberByMemberId(memberId);
        return umsMemberReceiveAddress;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "你好";
    }
}
