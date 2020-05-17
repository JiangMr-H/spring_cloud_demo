/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: KeyResolverConfiguration
 * Author:   891649
 * Date:     2020/5/17 7:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.gateway;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2020/5/17
 * @since 1.0.0
 */
@Configuration
public class KeyResolverConfiguration {

    /**
     * 编写基于请求路径的限流规则
     *
     * @return
     */
   // @Bean
    public KeyResolver pathKeyResolver(){
        //自定义的KeyResolver
        return new KeyResolver(){
            @Override
            public Mono<String> resolve(ServerWebExchange exchange) {

                return Mono.just(exchange.getRequest().getPath().toString());
            }
        };
    }

    @Bean
    public KeyResolver userKeyResolver(){
        return exchange -> Mono.just(
                exchange.getRequest().getQueryParams().getFirst("userId")
                //exchange.getRequest().getHeaders().getFirst("X-Forwarded-For") //基于请求ip的限流
        );
    }

}