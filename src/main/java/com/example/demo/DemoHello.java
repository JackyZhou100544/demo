package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZHOUYAO on 2018/4/11.
 */
@RestController
public class DemoHello {
    @RequestMapping("/hello")
    public String  testDemo(){
        return "hello world!";
    }

}
