/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductController
 * Author:   891649
 * Date:     2020/5/13 17:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.product.controller;

import com.gree.product.entity.Product;
import com.gree.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 891649
 * @create 2020/5/13
 * @since 1.0.0
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Value("${server.port}")
    private String port;
    @Value("${spring.cloud.client.ip-address}")   //spring cloud 自动的获取当前应用的ip地址
    private String ip;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findProductById(@PathVariable("id") Long id) {
        Product product = productService.findProductById(id);
        product.setProductName("访问的服务地址："+ip+":"+port);
        return product;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String save(@RequestBody Product product) {
        productService.save(product);
        return "保存成功";
    }


}