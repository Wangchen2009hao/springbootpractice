package com.zhuanzhuan._006Bean的初始化和销毁;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("JSR250 way service init");
    }

    public JSR250WayService() {
        System.out.println("JSR250 way service init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("JSR250 way service destroy");
    }
}
