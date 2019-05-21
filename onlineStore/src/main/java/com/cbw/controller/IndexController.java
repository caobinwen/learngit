package com.cbw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页展示
 *
 * @author 曹彬文
 * @create 2019-05-21 11:37
 **/

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "Hello World";
    }
}
