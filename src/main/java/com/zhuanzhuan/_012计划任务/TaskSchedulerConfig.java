package com.zhuanzhuan._012计划任务;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author wangchen11
 * @date 2018年01月24日 0:26
 */
@Configuration
@ComponentScan("com.zhuanzhuan._012计划任务")
@EnableScheduling // 开启计划任务执行
public class TaskSchedulerConfig {
}
