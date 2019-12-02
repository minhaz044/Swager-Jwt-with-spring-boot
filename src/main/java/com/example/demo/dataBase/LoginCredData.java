package com.example.demo.dataBase;

import com.example.demo.model.JwtRequest;

import java.util.List;

public class LoginCredData {
    private static List<JwtRequest> userList;
    public List<JwtRequest> getAllUser(){
        return userList;
    }
}
