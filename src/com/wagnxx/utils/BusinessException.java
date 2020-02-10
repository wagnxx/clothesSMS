package com.wagnxx.utils;

public class BusinessException extends RuntimeException {

    public BusinessException(){
        super();
    }
    public BusinessException(String error){
        super(error);
    }
}
