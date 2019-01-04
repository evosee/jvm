package com.example.demo.jvm.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chensai
 * @Date: 2019/1/3 16:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/web/")
public class WebController {
    @RequestMapping("object")
    public String getObject(){
        char[] webc = new char[1024*1024*200];
        return "object";
    }
}
