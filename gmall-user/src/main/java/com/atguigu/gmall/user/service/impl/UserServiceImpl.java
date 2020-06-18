package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMerberList = userMapper.selectAll();
        return umsMerberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getMemberByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddressu= new UmsMemberReceiveAddress();
        umsMemberReceiveAddressu.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressuList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddressu);
        return umsMemberReceiveAddressuList;
    }
}
