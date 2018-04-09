package com.zhuanzhuan.taskexecutor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author wangchen11
 * @date 2018年01月24日 0:00
 */
@Configuration
@EnableAsync
@ComponentScan("com.zhuanzhuan.taskexecutor")
public class TaskExecutorConfig1 {
}
