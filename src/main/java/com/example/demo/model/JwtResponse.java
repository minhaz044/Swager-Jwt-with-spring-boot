package com.example.demo.model;

import java.util.Date;


public class JwtResponse {
    public JwtResponse(String token,Date date){
        this.token=token;
        this.expireDate=date;
    }
    public JwtResponse(String token){
        this.token=token;
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        expireDate = expireDate;
    }

    public String token;
    public Date expireDate;
}
