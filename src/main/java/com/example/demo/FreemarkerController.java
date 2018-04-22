package com.example.demo;

import com.example.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZHOUYAO on 2018/4/18.
 */
@EnableConfigurationProperties(Resource.class)
@Controller
@RequestMapping("/ftl")
public class FreemarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("resource",resource);
        return "freemarker/center/index";
    }

    @RequestMapping("/center")
    public String center(){
        return "freemarker/center/center";
    }

}
