package com.luohao.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Title: Products
 * @Author Mr.罗
 * @Package com.luohao.pojo
 * @Date 2024/1/18 17:45
 * @description:
 */
@Data  //Lombok插件提供的注解，使用该注解可以帮我们自动生成getset方法以及tostring等方法，简化代码，提高了开发效率
@Table(name = "products")//该注解的作用就是将该类映射到数据库中对应的products表上
public class Products {
    @Id //该注解的作用就是将对应的成员属性映射到对应表中各个字段上
    private int id;
    private String name;
    private Double price;
    private String flag;
    private String goodsDesc;
    private String images;
    private Integer goodsStock;
    private String goodsType;
}
