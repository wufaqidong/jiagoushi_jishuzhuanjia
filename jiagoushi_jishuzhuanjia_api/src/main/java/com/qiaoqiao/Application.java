package com.qiaoqiao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: jiagoushi_jishuzhuanjia
 * @description:
 * @author: xiebinbin
 * @create: 2022-06-26 15:34
 **/

@SpringBootApplication
@MapperScan(basePackages = "com.qiaoqiao.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
