package com.zhuanzhuan._013组合注解;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void outPutResult(){
        System.out.println("从组合注解中照样可以拿到类");
    }
}
