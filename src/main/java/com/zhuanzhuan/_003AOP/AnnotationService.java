package com.zhuanzhuan._003AOP;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {

    // 这里默认的值是 value, 所以必须写 name =
    @Action(name = "这里是注解里写的名字")
    public void sayHello(){
        System.out.println("annotation say hello");
    }
}
