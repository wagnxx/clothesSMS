package com.wagnxx.ui;

import com.wagnxx.utils.BusinessException;

public class WelcomClass extends BaseClass {
    public void  startt(){
        print(getString("info.welcom"));
        boolean flag = true;
        while (flag){
            print(getString("info.login.reg"));
            print(getString("info.select"));

            String select = input.nextLine();
            switch (select) {
                case "1":
                    try {

                        new LoginClass().login();
                        flag=false;
                        println("login.success");
                    }catch (BusinessException e){
                        println(e.getMessage());
                    }
                    break;
                case "2":
                    flag=false;
                    try {
                        new RegisterClass().register();
                        println(getString("reg.success"));
                    }catch (BusinessException e){
                        println(getString("reg.error"));
                    }
                    break;
                default:
                    println(getString("input.error"));
                    break;
            }
        }

    }
}
