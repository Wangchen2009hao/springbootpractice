package com.zhuanzhuan._004Bean的scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);

        SingletonService sin1 = applicationContext.getBean(SingletonService.class);
        SingletonService sin2 = applicationContext.getBean(SingletonService.class);

        PrototypeService pro1 = applicationContext.getBean(PrototypeService.class);
        PrototypeService pro2 = applicationContext.getBean(PrototypeService.class);

        System.out.println(sin1.equals(sin2));// true
        System.out.println(pro1.equals(pro2));// false

        applicationContext.close();
    }
}
