package com.zhuanzhuan.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangchen11
 * @date 2018年01月24日 0:05
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig2.class);
        AsyncTaskService bean = applicationContext.getBean(AsyncTaskService.class);
        for (int i = 0; i < 100; i++) {
            bean.exeTask(i);
        }

    }
}
