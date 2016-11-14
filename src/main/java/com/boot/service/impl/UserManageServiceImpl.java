package com.boot.service.impl;

import com.boot.dao.UserManageDao;
import com.boot.model.UserMange;
import com.boot.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZHAO130 on 2016/11/10.
 */
@Service
public class UserManageServiceImpl implements UserManageService{
    @Autowired
    public UserManageDao userManageDao;

    public List<UserMange> findAll(){
        return userManageDao.findAll();
    }
    public UserMange saveUser(UserMange user){
        return userManageDao.save(user);
    }
    public List<UserMange> findByName(String name){
        return userManageDao.findByName(name);
    }

}
