package com.wagnxx.service;

import com.wagnxx.bean.User;
import com.wagnxx.utils.BusinessException;

import java.sql.BatchUpdateException;

public interface UserService {
    public User register(User user) throws BusinessException;
    public User login(String username,String password) throws BatchUpdateException;
}
