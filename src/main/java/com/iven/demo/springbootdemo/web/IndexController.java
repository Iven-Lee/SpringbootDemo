package com.iven.demo.springbootdemo.web;

import com.iven.demo.springbootdemo.schoolDefine.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
//@RestController--------@Controller+@ResponseBody返回json数据格式
public class IndexController {

    @Value("${schoolname}")
    private String schoolName;

    @Value("${websit}")
    private String websit;

    @Autowired
    private School school;

    @RequestMapping(value = "/one")
    public @ResponseBody String say01() {
        return "Hello:" + schoolName + ":" + websit;
    }


    @RequestMapping(value = "/two")
    public @ResponseBody String say02() {
        return "sch.name="+school.getName()+"-----sch.websit="+school.getWebsit();
    }

    @RequestMapping(value = "/three/{a}/{b}")
    public @ResponseBody String say03(@PathVariable("a") Integer a,
                                      @PathVariable("b") Integer b) {
        return "id编号为："+a+"-----年龄为："+b;
    }
}
