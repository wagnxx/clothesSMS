package com.wagnxx.utils;

import com.wagnxx.bean.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserIo {
    private static List<User> users=new ArrayList<>();
    private static final String USRER_FILE="user.obj";

    // 写入用户列表
    public boolean writeUsers() throws BusinessException{
        try {
            ObjectOutputStream out=new ObjectOutputStream(
                    new FileOutputStream(USRER_FILE)
            );
            out.writeObject(users);
            out.close();
            return  true;
        } catch (IOException e) {
            throw  new BusinessException("io.write.error");
        }

    }

    //读取用户列表
    public boolean readUsers() throws BusinessException{
        try{
            ObjectInputStream  in = new ObjectInputStream(
              new FileInputStream(USRER_FILE)
            );
             users = (List<User>)in.readObject();
             in.close();
             return true;

        } catch (IOException |ClassNotFoundException e) {
            throw new BusinessException("io.read.error");
        }

    }
    // 添加用户
    public void add(User user){
        user.setId(users.size()+1);
        users.add(user);
    }

    public User findByUsernameAndPassword(String username,String password){
        for(User u:users){
            if(u.getUsername().equals(username)&&
            u.getPassword().equals(password)){
                return  u;
            }
        }
        return null;
    }
}
