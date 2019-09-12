package com.gmall.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gmall.user.bean.UmsMember;
import com.gmall.user.mapper.UmsMemberMapper;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author: aqua
 * @create: 2019-09-12 09:22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UserService {

    @Autowired(required = false)
    private UmsMemberMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectByMap(new HashMap<>(16));
    }
}