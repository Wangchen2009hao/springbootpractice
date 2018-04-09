package com.zhuanzhuan.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author wangchen11
 * @date 2018年01月24日 0:26
 */
@Configuration
@ComponentScan("com.zhuanzhuan.taskScheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
