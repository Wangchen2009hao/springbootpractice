package com.zhuanzhuan._003AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        FunctionService fun = context.getBean(FunctionService.class);
        fun.sayHello();

        AnnotationService ann = context.getBean(AnnotationService.class);
        ann.sayHello();

        context.close();
    }
}
