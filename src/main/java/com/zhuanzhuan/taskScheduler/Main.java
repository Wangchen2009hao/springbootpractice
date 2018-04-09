package com.zhuanzhuan.taskScheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangchen11
 * @date 2018年01月24日 0:27
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
