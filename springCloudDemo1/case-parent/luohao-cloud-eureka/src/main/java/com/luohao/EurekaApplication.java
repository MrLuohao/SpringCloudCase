package com.luohao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title: EurekaApplication
 * @Author Mr.罗
 * @Package com.luohao
 * @Date 2024/1/22 15:33
 * @description: Eureka微服务项目的启动类
 */
@SpringBootApplication   //表示该类为Eureka server微服务项目启动类
@EnableEurekaServer  //标识当前项目为Eureka Server
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
