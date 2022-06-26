package com.qiaoqiao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: jiagoushi_jishuzhuanjia
 * @description:
 * @author: xiebinbin
 * @create: 2022-06-26 15:41
 **/

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello(){
        return "Hello world!";
    }
}
