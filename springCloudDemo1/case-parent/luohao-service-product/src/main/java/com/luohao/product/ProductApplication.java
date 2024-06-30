package com.luohao.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Title: ProductApplication
 * @Author Mr.罗
 * @Package com.luohao.product
 * @Date 2024/1/18 18:38
 * @description: 商品微服务启动类, 因为该微服务项目需要对外提供商品服务，所以需要创建启动类来启动项目也就是启动商品服务器，而公共组件和父工程的作用仅仅是为了提供公用的依赖以便于集中管理，不对外提供其它服务，所以不需要创建启动类来启动项目
 */
@SpringBootApplication  //标识该类为项目启动类
//@EnableEurekaClient  //标识将将项目作为Eureka Client注册到Eureka Server  （弊端：只能在Eureka环境当中使用）
@EnableDiscoveryClient  //也是将该项目作为客户端注册到注册中心，但是可以在所有的服务注册中心环境下使用，使用起来更加的灵活
@MapperScan("com.luohao.product.mapper")  //开启注解扫描
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
