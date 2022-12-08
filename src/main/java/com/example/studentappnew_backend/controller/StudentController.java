package com.example.studentappnew_backend.controller;


import com.example.studentappnew_backend.dao.StudentDao;
import com.example.studentappnew_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage()
    {
        return "Welcome to my website";
    }

    @PostMapping(path="/add",consumes ="application/json",produces ="application/json" )
    public Map<String,String> AddStudent(@RequestBody Students s){
        System.out.println(s.getName().toString());
        dao.save(s);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }



    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Students> Viewstudents(){
        return (List<Students>) dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path="/search",consumes ="application/json",produces ="application/json" )
    public String Searchstudents(){
        return "Search successfull";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/delete",consumes ="application/json",produces ="application/json" )
    public String Deletestudents(){
        return "Search successfull";
    }


}
