/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TurbinApplication
 * Author:   891649
 * Date:     2020/5/15 14:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2020/5/15
 * @since 1.0.0
 */
@SpringBootApplication
//trubin配置激活
@EnableTurbine
@EnableHystrixDashboard
public class TurbinApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbinApplication.class,args);
    }

}