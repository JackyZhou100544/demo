package com.example.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by ZHOUYAO on 2018/4/14.
 */
@Configuration
@ConfigurationProperties(prefix = "remote",ignoreUnknownFields = false)
@PropertySource("classpath:remote.properties")
@Component
public class RemoteProperties {
private String uploadFilesUrl;
private String uploadPicUrl;

    public void setUploadFilesUrl(String uploadFilesUrl) {
        this.uploadFilesUrl = uploadFilesUrl;
    }

    public void setUploadPicUrl(String uploadPicUrl) {
        this.uploadPicUrl = uploadPicUrl;
    }

    public String getUploadFilesUrl() {
        return uploadFilesUrl;
    }

    public String getUploadPicUrl() {
        return uploadPicUrl;
    }
}
