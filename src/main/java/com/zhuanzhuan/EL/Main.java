package com.zhuanzhuan.EL;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangchen11
 * @date 2018年01月23日 1:12
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig bean = applicationContext.getBean(ELConfig.class);
        bean.output();

    }
}

