package com.zhuanzhuan.依赖注入;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public void sayHello(String name){
        System.out.println(name);
        functionService.sayHello();
    }
}
