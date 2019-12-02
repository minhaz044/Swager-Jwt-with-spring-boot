package com.example.demo.Controller;

import com.example.demo.Service.JwtUtil;
import com.example.demo.Service.MyUserDetailService;
import com.example.demo.model.JwtRequest;
import com.example.demo.model.JwtResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


@RestController
public class Controller {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MyUserDetailService UserDetailsService;
    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("")
    public String index(){
        return "Api is Working.";
    }
    @PostMapping("/authenticate")
    public ResponseEntity authenticate(@RequestBody JwtRequest jwtRequest){
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getPassword(),jwtRequest.getPassword()));
        }catch (BadCredentialsException e){
            throw e;
        }
        UserDetails userDetails=UserDetailsService.loadUserByUsername(jwtRequest.getUserName());
        String token=jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token, new Date()));
    }
}
