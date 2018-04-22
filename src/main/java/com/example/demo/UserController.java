package com.example.demo;

import com.example.pojo.ImoocJsonResult;
import com.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by ZHOUYAO on 2018/4/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {


        @RequestMapping("/getUser")
        @ResponseBody
        public Object  hello(){
            User u = new User();
            u.setName("imooc666");
            u.setAge(18);
            u.setBirthday(new Date());
            u.setPassword("immoc1");
          //  u.getDesc(null);
           return ImoocJsonResult.ok(u);
        }
}
