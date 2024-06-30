package com.luohao.product.service.impl;

import com.luohao.pojo.Products;
import com.luohao.product.mapper.ProductMapper;
import com.luohao.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Title: ProductServiceImpl
 * @Author Mr.罗
 * @Package com.luohao.product.service.impl
 * @Date 2024/1/18 19:00
 * @description: 商品service层的实现类
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Products QueryById(Integer id) {
        return productMapper.selectById(id);
    }
}
