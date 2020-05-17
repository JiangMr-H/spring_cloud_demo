/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MessageListener
 * Author:   891649
 * Date:     2020/5/17 16:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.stream.consumer;

import com.gree.stream.channel.MyProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2020/5/17
 * @since 1.0.0
 */
@Component
@EnableBinding(MyProcessor.class)
public class MessageListener {

    //监听binding中的消息
    @StreamListener(MyProcessor.MYINPUT)
    public void input(String message){
        System.out.println("获取到消息：" + message);
    }





}