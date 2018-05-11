package com.zhuanzhuan._010多线程;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangchen11
 * @date 2018年01月24日 0:05
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TaskExecutorConfig2.class);
        AsyncTaskService bean = applicationContext.getBean(AsyncTaskService.class);
        // [Running, pool size = 10, active threads = 10, queued tasks = 25, completed tasks = 0]  只能执行 35 个
        for (int i = 0; i < 100; i++) {
            bean.exeTask(i);
        }

    }
}
