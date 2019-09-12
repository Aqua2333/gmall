package com.gmall.user.service;

import com.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * @author: aqua
 * @create: 2019-09-12 09:22
 */
public interface UserService {

    /**
     * 获取所有用户
     * @return 用户列表
     */
    List<UmsMember> getAllUser();
}