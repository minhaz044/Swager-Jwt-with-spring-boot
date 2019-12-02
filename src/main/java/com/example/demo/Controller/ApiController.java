package com.example.demo.Controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(tags = "Home Controller",description = "This is description for home Controller.")
public class ApiController
{
    @GetMapping("/")
    public String index(){
        return "Private Api is Working.";
    }
    @GetMapping("/home")
    public String home(){
        return "Home";
    }
}
