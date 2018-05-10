package com.zhuanzhuan._003AOP;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public void sayHello(){
        System.out.println("==================Hello AOP================");
    }
}
