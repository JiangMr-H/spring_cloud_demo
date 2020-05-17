package com.gree.product.service;

import com.gree.product.entity.Product;

public interface ProductService {

    /**
     * 根据ID查询
     */
    Product findProductById(Long id);

    /**
     * 保存
     */
    void save(Product product);

    /**
     * 更新
     */
    void update(Product product);

    /**
     * 删除
     */
    void delete(Long id);


}
