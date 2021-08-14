package com.iven.demo.springbootdemo.schoolDefine;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component//将此类将给spring容器进行管理
@ConfigurationProperties(prefix = "sch")
public class School {

    private String name;

    private String websit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsit() {
        return websit;
    }

    public void setWebsit(String websit) {
        this.websit = websit;
    }
}
