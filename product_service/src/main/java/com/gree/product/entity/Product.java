/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: product
 * Author:   891649
 * Date:     2020/5/13 16:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.product.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈商品〉
 *
 * @author 891649
 * @create 2020/5/13
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    private Long id;
    private String productName;
    private Integer status;
    private BigDecimal price;
    private String productDesc;
    private String caption;
    private Integer inventory;

}