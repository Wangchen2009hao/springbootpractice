package com.zhuanzhuan._011条件注解Condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService listService = applicationContext.getBean(ListService.class);
        System.out.println(listService.showListCmd());

    }
}
