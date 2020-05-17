package com.gree.product.dao;

import com.gree.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 接口继承
 */
public interface productDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

}
