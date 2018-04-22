package com.example.demo;

import com.example.pojo.ImoocJsonResult;
import com.example.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZHOUYAO on 2018/4/13.
 */
@EnableConfigurationProperties(Resource.class)
@RestController
public class HelloController {

    @Autowired
    private Resource resource;
    @RequestMapping("/getResource")
    public ImoocJsonResult hello(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);
      return ImoocJsonResult.ok(bean);
    }

}
