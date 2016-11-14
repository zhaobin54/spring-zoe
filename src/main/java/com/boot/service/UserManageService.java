package com.boot.service;

import com.boot.model.UserMange;

import java.util.List;

/**
 * Created by ZHAO130 on 2016/11/10.
 */
public interface UserManageService {
    public List<UserMange> findAll();
    public UserMange saveUser(UserMange user);
    public List<UserMange> findByName(String name);
}
