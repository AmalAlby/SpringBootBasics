package com.example.studentappnew_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String Homepage()
    {
        return "Welcome to my website";
    }

    @GetMapping("/contact")
    public String Contacts(){
        return "Welcome to my contact page.....";
    }

    @GetMapping("/gallery")
    public String Gallery(){
        return  "This is my Gallery";
    }

    @GetMapping("/home")
    public String Home(){
        return  "This is my Home";
    }


}
