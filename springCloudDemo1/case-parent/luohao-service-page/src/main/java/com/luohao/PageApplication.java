package com.luohao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: PageApplication
 * @Author Mr.罗
 * @Package com.luohao
 * @Date 2024/1/19 15:03
 * @description: 创建页面静态化微服务的启动类
 */
@SpringBootApplication  //标识该类为静态页面微服务启动类
//@EnableEurekaClient  //表示将该项目作为Eureka Client注册到Eureka Server
@EnableDiscoveryClient  //也是将该项目作为客户端注册到注册中心，但是可以在所有的服务注册中心环境下使用，使用起来更加的灵活
public class PageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageApplication.class, args);
    }

    /*
    RestTemplate:底层封装了httpClient，封装了http相关协议，因为微服务之间需要相互调用，就需要通过HTTP协议进行，所以需要将RestTemplate注入到spring容器中便于调用
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
