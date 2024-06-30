package com.luohao.controller;

import com.luohao.pojo.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: PageController
 * @Author Mr.罗
 * @Package com.luohao.controller
 * @Date 2024/1/19 15:42
 * @description: 静态网页微服务Controller层
 */
@RestController
@RequestMapping("/page")
public class ControllerPage {

    @Autowired
    private RestTemplate restTemplate;  //注入RestTempalte对象用于微服务之间的相互调用

    /*
    根据商品id查询该商品的相关信息
     */
    @GetMapping("getProduct/{id}")
    public Products FindProductById(@PathVariable Integer id) {
        String url = "http://localhost:9000/product/query/";
        //调用restTemplate.getForObject方法底层会采用转发的方式，转发到对应的url进行对应服务器（微服务）的访问，一次请求，最终将结果返回
        return restTemplate.getForObject(url + id, Products.class);
    }
}
