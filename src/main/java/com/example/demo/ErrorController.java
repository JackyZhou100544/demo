package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ZHOUYAO on 2018/4/21.
 */

@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/error")
    public String error(){
        int a = 1/0;
        return "freemarker/center/error";
    }
}
