/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MessageSender
 * Author:   891649
 * Date:     2020/5/17 16:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.stream.producer;

import com.gree.stream.channel.MyProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
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
public class MessageSender {

    @Autowired
    @Qualifier("myoutput")
    private MessageChannel myoutput;
    //发送消息
    public void send(Object obj){
        myoutput.send(MessageBuilder.withPayload(obj).build());
    }


}