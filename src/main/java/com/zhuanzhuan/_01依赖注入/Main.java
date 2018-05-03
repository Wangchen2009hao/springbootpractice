package com.zhuanzhuan._01依赖注入;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试自动注入用的
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Diconfig.class);

        UseFunctionService functionService = applicationContext.getBean(UseFunctionService.class);
        functionService.sayHello("wangchen");

    }
}
