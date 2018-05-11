package com.zhuanzhuan._008ApplicationEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoDemoListener implements ApplicationListener<DemoEvent>{
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String message = demoEvent.getMsg();
        System.out.println("我接受到了消息，消息是："+message);
    }
}
