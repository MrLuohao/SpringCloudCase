package com.luohao.product.service;

import com.luohao.pojo.Products;
import org.springframework.stereotype.Service;

/**
 * @Title: ProductService
 * @Author Mr.罗
 * @Package com.luohao.product.service
 * @Date 2024/1/18 18:56
 * @description: 创建商品微服务的service层接口
 */
public interface ProductService {

    /*
    通过商品Id查询对应的商品信息
     */
    Products QueryById(Integer id);
}
