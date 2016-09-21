package com.cn.control;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lisa on 2016/9/20.
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {
    @RequestMapping("/mvc")
    public String helloMvc(){
        //host:8080/hello/mvc
        return "home";
    }

}
