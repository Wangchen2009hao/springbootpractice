package com.zhuanzhuan;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author wangchen11
 * @date 2017年12月07日 23:15
 */
@Aspect
@Component
public class LogAspect {

    public void before(JoinPoint joinPoint){
        System.out.println("aaa");
    }

}
