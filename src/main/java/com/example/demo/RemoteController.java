package com.example.demo;

import com.example.pojo.RemoteProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZHOUYAO on 2018/4/14.
 */
@EnableConfigurationProperties(RemoteProperties.class)
@RestController
public class RemoteController {

    @Autowired
    private RemoteProperties remoteProperties;

    public void test(){
         String str=remoteProperties.getUploadFilesUrl();
         System.out.println(str);
    }
}
