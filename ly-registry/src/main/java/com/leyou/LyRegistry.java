package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer//将项目作为SpringCloud中的注册中心
@SpringBootApplication//表示启动类
public class LyRegistry {
    public static void main(String[] args) {
        //启动程序
        SpringApplication.run(LyRegistry.class, args);
    }
}