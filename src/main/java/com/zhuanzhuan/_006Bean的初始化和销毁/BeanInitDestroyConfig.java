package com.zhuanzhuan._006Bean的初始化和销毁;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInitDestroyConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService getBeanwayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService getJSR250Service(){
        return new JSR250WayService();
    }
}
