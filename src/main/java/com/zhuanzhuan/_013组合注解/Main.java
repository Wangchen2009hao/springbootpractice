package com.zhuanzhuan._013组合注解;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService bean = applicationContext.getBean(DemoService.class);
        bean.outPutResult();
        applicationContext.close();
    }
}
