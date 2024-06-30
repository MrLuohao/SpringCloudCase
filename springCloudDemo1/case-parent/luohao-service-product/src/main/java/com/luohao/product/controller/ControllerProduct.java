package com.luohao.product.controller;

import com.luohao.pojo.Products;
import com.luohao.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Title: ControllerProduct
 * @Author Mr.罗
 * @Package com.luohao.product.controller
 * @Date 2024/1/18 19:05
 * @description: 创建商品微服务的Controller层
 */
@RestController //添加该注解标识该类中方法的返回值以json格式进行返回
@RequestMapping("/product") //标识该类的访问路径（标识是商品服务）
public class ControllerProduct {
    @Autowired
    private ProductService productService; //注入service层的实体对象

    @GetMapping("/query/{id}") //restful编程风格
    public Products QueryById(@PathVariable Integer id) {  //将请求参数的id映射到方法的参数上
        return productService.QueryById(id);
    }
}
