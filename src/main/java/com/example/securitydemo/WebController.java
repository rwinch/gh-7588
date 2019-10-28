package com.example.securitydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    IDemoService demoService;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/restrictedWithoutParam")
    public String restricted1() {
        return demoService.methodWithoutParameter();
    }

    @GetMapping("/restrictedWithParam")
    public String restricted2() {
        return demoService.methodWithParameter(new DemoEntity());
    }
}
