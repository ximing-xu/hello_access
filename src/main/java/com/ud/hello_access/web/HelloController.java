package com.ud.hello_access.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "what's your name?";
    }
    @RequestMapping("/hi")
    public String sayHi(){
        return "hi Lucy";
    }
}
