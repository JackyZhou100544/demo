package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ZHOUYAO on 2018/4/19.
 */
@Controller
@RequestMapping("th")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name","thymeleaf-imooc");
        return "freemarker/center/index1";
    }

    @RequestMapping("/center")
    public String center(){
         return "freemarker/center/center1";
    }

}
