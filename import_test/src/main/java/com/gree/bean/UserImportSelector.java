/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserImportSelector
 * Author:   891649
 * Date:     2020/5/14 14:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2020/5/14
 * @since 1.0.0
 */
public class UserImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //获取配置类的名称
        return new String[]{UserConfiguration.class.getName()};
    }
}