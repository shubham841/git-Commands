package com.shubham.github;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello world");
        return "Hello world";
    }
}
