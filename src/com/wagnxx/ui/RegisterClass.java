package com.wagnxx.ui;

import com.wagnxx.bean.User;
import com.wagnxx.service.UserService;
import com.wagnxx.service.impl.UserServiceImpl;
import com.wagnxx.utils.BusinessException;

public class RegisterClass extends BaseClass{
    public void register()throws BusinessException {

        println("input.username");
        String username = input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();
        User user = new User(username,password);
        UserService userService =new UserServiceImpl();
        userService.register(user);
    }
}
