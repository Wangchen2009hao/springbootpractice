package com.zhuanzhuan._007Profile区分环境;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("test1")
    DemoBean getProBean(){
        return new DemoBean("初始化了 pro 的 bean");
    }

    @Bean
    @Profile("test2")
    DemoBean getDevBean(){
        return new DemoBean("初始化了 dev 的 bean");
    }
}
