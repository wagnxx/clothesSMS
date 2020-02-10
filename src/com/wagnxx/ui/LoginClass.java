package com.wagnxx.ui;

import com.wagnxx.bean.User;
import com.wagnxx.service.UserService;
import com.wagnxx.service.impl.UserServiceImpl;
import com.wagnxx.utils.BusinessException;

import java.sql.BatchUpdateException;

public class LoginClass extends BaseClass {
    public void login() throws BusinessException
    {
        println(getString("input.username"));
        String username = input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();

        UserService userService = new UserServiceImpl();
        try {
            User user = userService.login(username,password);
            if(user!=null){
                currUser=user;
            }
        } catch (BatchUpdateException e) {
           throw  new BusinessException("login.error");
        }
    }

}
