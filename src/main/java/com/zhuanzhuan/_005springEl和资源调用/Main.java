package com.zhuanzhuan._005springEl和资源调用;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig el = applicationContext.getBean(ElConfig.class);
        el.outputStream();

        applicationContext.close();
    }
}
