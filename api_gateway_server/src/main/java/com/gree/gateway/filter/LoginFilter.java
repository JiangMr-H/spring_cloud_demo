/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: LoginFilter
 * Author:   891649
 * Date:     2020/5/16 16:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 〈一句话功能简述〉<br>
 * 〈自定义一个全局过滤器
 * 实现GlobalFilter, Ordered 接口
 * 〉
 *
 * @author 891649
 * @create 2020/5/16
 * @since 1.0.0
 */
@Component
public class LoginFilter implements GlobalFilter, Ordered {

    /**
     * 执行过滤器中的业务逻辑
     * 对请求参数中的access-token进行判断
     * 如果存在此参数：代表已经认证成功
     * 如果不存在此参数：认证失败
     * ServerWebExchange: 相当于请求和响应的上下文（zuul中的RequestContext）
     *
     * @param exchange
     * @param chain
     * @return
     */
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        //System.out.println("执行了自定义的全局过滤器");
//        获取请求参数access-token
        String token = exchange.getRequest().getQueryParams().getFirst("access-token");
//        判断是否存在
        if (token == null) {
//        如果存在： 认证失败
            System.out.println("没有登录");
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();  //请求结束
        }
//        不存在：继续执行
        return chain.filter(exchange);  //只有这样的返回  才能继续向下执行
    }

    /**
     * 过滤器的执行顺序，值越小，优先级越高
     *
     * @return
     */
    public int getOrder() {
        return 1;
    }
}