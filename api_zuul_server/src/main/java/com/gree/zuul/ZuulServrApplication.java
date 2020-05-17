/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ZuulServrApplication
 * Author:   891649
 * Date:     2020/5/16 14:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2020/5/16
 * @since 1.0.0
 */
@SpringBootApplication
//开启网关
@EnableZuulProxy
//eureka的服务发现
@EnableDiscoveryClient
public class ZuulServrApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServrApplication.class,args);
    }

}