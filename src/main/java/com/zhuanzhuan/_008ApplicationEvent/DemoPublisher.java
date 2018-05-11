package com.zhuanzhuan._008ApplicationEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class DemoPublisher {
    @Autowired
    public ApplicationContext applicationContext;

    public void publish(String message){
        applicationContext.publishEvent(new DemoEvent(this, message));
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
