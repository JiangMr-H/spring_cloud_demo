/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestApplication
 * Author:   891649
 * Date:     2020/5/14 14:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.test;

import com.gree.bean.EnableUserBean;
import com.gree.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2020/5/14
 * @since 1.0.0
 */
@EnableUserBean
public class TestApplication {

    public static void main(String[] args) {
        //获取spring容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestApplication.class);
        User user = ac.getBean(User.class);
        System.out.println(user);
    }

}