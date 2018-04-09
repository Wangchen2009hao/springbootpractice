package com.zhuanzhuan.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangchen11
 * @date 2017年12月11日 20:52
 */
public class AAA {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.add();
    }
}
