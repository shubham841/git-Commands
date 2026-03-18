package com.shubham.github;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @RequestMapping("/contact")
    public String hello(){
        System.out.println("Hello world");
        return "Feature change for PR";
    }
}
