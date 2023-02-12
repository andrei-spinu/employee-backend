package com.endava.jpademo.service;

public class NoDataFoundException extends RuntimeException{
    public NoDataFoundException(){
        super("No data found");
    }
}
