package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.*;
@RestController
public class HelloController {




    @RequestMapping("/endpoint1")
    public String index() {

        return "Hello World.. End point 1 \n";
    }



}
