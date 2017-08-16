package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ABC on 2017/8/1.
 */
@RestController
@RequestMapping("/test")
public class ConTest {
    @RequestMapping("/1")
    public void Test(){
        System.out.println("1111111111");
    }
}
