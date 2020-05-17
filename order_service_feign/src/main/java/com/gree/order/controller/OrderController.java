/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: OrderController
 * Author:   891649
 * Date:     2020/5/13 17:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.order.controller;

import com.gree.order.entity.Product;
import com.gree.order.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 891649
 * @create 2020/5/13
 * @since 1.0.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private ProductFeignClient productFeignClient;

    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {

        Product product = null;
        //如何调用商品服务？
        product = productFeignClient.findById(id);
        return product;
    }



//    @Autowired
//    private RestTemplate restTemplate;
//
//    /**
//     * 基于ribbon的形式调用远程微服务
//     * 1.使用@LoadBalanced声明RestTemplate
//     * 2.使用服务名称替换IP地址
//     * 通过订单系统，调用商品服务根据id查询商品信息
//     * 1、需要配置商品对象
//     * 2、需要调用商品服务
//     *
//     * @param id 商品id
//     * @return
//     */
//    @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
//    public Product findById(Long id) {
//
//        Product product = null;
//        //如何调用商品服务？
//        product = restTemplate.getForObject("http://service-product/product/1", Product.class);
//        return product;
//    }


    /**
     * 添加ribbon之前
     */
//   /**
//     * 注入DiscoveryClient
//     *      springcloud提供的获取原数组的工具类
//     *       调用方法获取服务的元数据信息
//     */
//    @Autowired
//    private DiscoveryClient discoveryClient;

   /* @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
    public Product findById(Long id) {

        //已调用服务名称获取所有的元数据
        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        //获取唯一的一个元数据
        ServiceInstance instance = instances.get(0);
        //根据元数据中的主机地址和端口号拼接请求微服务的URL
        Product product = null;
        //如何调用商品服务？
        product = restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/product/1", Product.class);
        return product;
    }*/

}