package com.wagnxx.service.impl;

import com.wagnxx.bean.User;
import com.wagnxx.service.UserService;
import com.wagnxx.utils.BusinessException;
import com.wagnxx.utils.EmptyUtils;
import com.wagnxx.utils.UserIo;

import java.sql.BatchUpdateException;

public class UserServiceImpl implements UserService {
    @Override
    public User register(User user) throws BusinessException {
        UserIo userIo = new UserIo();
        userIo.add(user);
        userIo.writeUsers();
        return user;
    }

    @Override
    public User login(String username, String password) throws BatchUpdateException {
        if(EmptyUtils.isEmpty(username)){
            throw new BusinessException("username.notnull");
        }
        if(EmptyUtils.isEmpty(password)){
            throw new BusinessException("password.notnull");

        }
        UserIo userIo = new UserIo();
        User user = userIo.findByUsernameAndPassword(username, password);

        return  user;
    }
}
