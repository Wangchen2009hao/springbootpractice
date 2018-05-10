package com.zhuanzhuan._007Profile区分环境;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.getEnvironment().setActiveProfiles("test2");
        applicationContext.register(ProfileConfig.class);
        applicationContext.refresh();

        DemoBean bean = applicationContext.getBean(DemoBean.class);

        System.out.println(bean.getContent());

        // 看看能不能中途切换
        // 结论 GenericApplicationContext does not support multiple refresh attempts: just call 'refresh' once
//        applicationContext.getEnvironment().setActiveProfiles("test2");
//        applicationContext.register(ProfileConfig.class);
//        applicationContext.refresh();
//
//        bean = applicationContext.getBean(DemoBean.class);
//
//        System.out.println(bean.getContent());

        applicationContext.close();
    }
}
