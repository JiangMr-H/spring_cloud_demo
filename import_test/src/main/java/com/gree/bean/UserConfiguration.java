/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserConfiguration
 * Author:   891649
 * Date:     2020/5/14 13:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.bean;

import org.springframework.context.annotation.Bean;

/**
 * 〈一句话功能简述〉<br> 
 * 〈没有spring注解〉
 *
 * @author 891649
 * @create 2020/5/14
 * @since 1.0.0
 */
public class UserConfiguration {

    @Bean
    public User getUser(){

        User user = new User();
         user.setUsername("张三");
         user.setAge(12);
        return user;

    }


}