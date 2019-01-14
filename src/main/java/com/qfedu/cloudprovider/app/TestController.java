package com.qfedu.cloudprovider.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "hello.do")
    public String hello(){
        System.out.println("回家");

        return "下课了";
    }

















}
