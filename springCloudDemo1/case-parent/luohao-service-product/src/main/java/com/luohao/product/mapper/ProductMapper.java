package com.luohao.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luohao.pojo.Products;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Title: ProductMapper
 * @Author Mr.罗
 * @Package com.luohao.product.mapper
 * @Date 2024/1/18 18:49
 * @description: 创建商品类的mapper文件以从数据库中调用相关商品信息
 */


/*
因为我们在公共组件微服务的pom文件中导入了mybatis-puls组件，该组件时mybatis的加强版，更好的整合了spring boot，使我们的开发得到了大大的简化
具体使用方法：让具体的mapper接口继承BaseMapper即可
 */
@Mapper
public interface ProductMapper extends BaseMapper<Products> {
    //在该接口底层已经帮我们封装好了我们常用的针对数据库的相关增删改查方法，所以我们只需要继承该接口便可以满足大部分功能需求，如果有一些其他的功能需求则自己添加相关方法即可
}
