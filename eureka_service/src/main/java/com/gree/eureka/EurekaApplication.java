/**
 * Copyright (C), 2015-2020, XXX??????
 * FileName: ProductApplication
 * Author:   891649
 * Date:     2020/5/13 17:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ?????????           ??????           ?????              ????
 */

package com.gree.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author 891649
 * @create 2020/5/13
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer   //激活eureka server
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }

}