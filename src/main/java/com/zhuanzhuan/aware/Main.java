package com.zhuanzhuan.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author wangchen11
 * @date 2018年01月23日 23:36
 */
public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService bean = applicationContext.getBean(AwareService.class);
        bean.outPut();
    }
}
