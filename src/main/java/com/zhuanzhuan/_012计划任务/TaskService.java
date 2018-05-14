package com.zhuanzhuan._012计划任务;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangchen11
 * @date 2018年01月24日 0:28
 */
@Service
public class TaskService {

    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "0 28 11 ? * *")
    public void cron(){
        System.out.println("一秒执行一次"+dateFormat.format(new Date()));
    }

    @Scheduled(fixedDelay = 5000)
    public void fixDelay(){
        System.out.println("延迟5秒执行一次"+dateFormat.format(new Date()));
    }

    @Scheduled(fixedRate = 5000)
    public void fixRate(){
        System.out.println("间隔5秒执行一次"+dateFormat.format(new Date()));
    }
}
