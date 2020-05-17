/**
 * Copyright (C), 2015-2020, XXX??????
 * FileName: ProductApplication
 * Author:   891649
 * Date:     2020/5/13 17:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ?????????           ??????           ?汾??              ????
 */

package order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author 891649
 * @create 2020/5/13
 * @since 1.0.0
 */
@SpringBootApplication
@EntityScan("com.gree.product.entity")
//激活hystrix
@EnableCircuitBreaker
public class RestOrderApplication {


    /**
     * 使用spring提供的RestTemplate发送http请求到商品服务
     *      1、创建RestTemplate对象交给容器管理
     *      2、在使用的时候,调用其方法完成操作
     * @LoadBalanced:是ribbon提供的负载均衡的注解
     * @param
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(RestOrderApplication.class,args);
    }

}