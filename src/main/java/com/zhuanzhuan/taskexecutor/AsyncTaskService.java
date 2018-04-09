package com.zhuanzhuan.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author wangchen11
 * @date 2018年01月24日 0:04
 */
@Service
public class AsyncTaskService {

    @Async
    public void exeTask(Integer i){
        System.out.println("异步执行任务 ： "+i);
    }
}
