package com.wsd.service;

import com.wsd.dao.UserDao;
import com.wsd.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by tm on 2018/7/19.
 * 用户service类
 */
@Service
public class UserService {
    @Autowired
    UserDao ud;
    public User getUser(){
        return ud.queryUser();
    }

}
