package com.zhuanzhuan._008ApplicationEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationEventConfig.class);
        DemoPublisher publisher = applicationContext.getBean(DemoPublisher.class);

        // 里面的容器和外边的容器是一样的
        System.out.println(applicationContext.equals(publisher.getApplicationContext()));

        publisher.publish("明天不用上班了");

//        try{
//            Thread.sleep(10000);
//        }catch(Exception e){
//           e.printStackTrace();
//
//        }

        applicationContext.close();
    }
}
