/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProducerApplication
 * Author:   891649
 * Date:     2020/5/17 15:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.stream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2020/5/17
 * @since 1.0.0
 */
@SpringBootApplication
public class ProducerApplication{

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class,args);
    }

}