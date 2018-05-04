package com.zhuanzhuan._002Java配置;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserFunctionService userFunctionService = applicationContext.getBean(UserFunctionService.class);

        // 调用业务方法
        userFunctionService.sayHello();

        // 关闭容器
        applicationContext.close();
    }
}
