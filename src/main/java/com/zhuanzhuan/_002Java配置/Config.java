package com.zhuanzhuan._002Java配置;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 这个配置相当于 spring-context 配置文件，里面可能定义 n 个bean
//@ComponentScan("com.zhuanzhuan")// 这里也不用扫描包
public class Config {

    @Bean// 声明返回的结果是一个 bean
    public FunctionService getFunctionService(){
        return new FunctionService();
    }

    @Bean// 声明返回的结果是一个 bean
    public UserFunctionService getUserFunctionService(){
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(getFunctionService());
        return userFunctionService;
    }

}
