package com.wagnxx.utils;

public class EmptyUtils {

    public static boolean isEmpty(String s){
        if(null==s || "".equals(s)){
            return true;
        }
        return false;
    }
}
