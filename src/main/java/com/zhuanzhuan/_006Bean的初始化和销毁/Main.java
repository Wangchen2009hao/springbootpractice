package com.zhuanzhuan._006Bean的初始化和销毁;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanInitDestroyConfig.class);

        applicationContext.getBean(BeanWayService.class);
        applicationContext.getBean(JSR250WayService.class);

        applicationContext.close();
    }
}
