/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: MyProcessor
 * Author:   891649
 * Date:     2020/5/17 16:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.stream.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 〈一句话功能简述〉<br> 
 * 〈自定义的消息通道〉
 *
 * @author 891649
 * @create 2020/5/17
 * @since 1.0.0
 */
public interface MyProcessor {

    /**
     * 消息生产者的配置
     */
    String MYOUTPUT ="myoutput";

    @Output("myoutput")
    MessageChannel myOutput();


    /**
     * 消息消费者的配置
     */
    String MYINPUT = "myinput";

    @Input("myinput")
    SubscribableChannel input();


}