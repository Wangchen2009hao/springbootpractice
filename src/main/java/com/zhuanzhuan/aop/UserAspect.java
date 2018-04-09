package com.zhuanzhuan.aop;

import jdk.nashorn.internal.scripts.JO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author wangchen11
 * @date 2017年12月11日 20:58
 */
@Component
@Aspect
//@Scope("singleton")
public class UserAspect {

//    // 注解 有代码提示
//    @Pointcut("@annotation(com.zhuanzhuan.aop.Action)")
//    public void annotationPointcut(){}
//
//    @After("annotationPointcut()")// 这个也有提示
//    public void after(JoinPoint joinPoint){
//        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
//        Method method = methodSignature.getMethod();
//        Action action = method.getAnnotation(Action.class);// 拿到注解类
//    }


    @Before("execution(* com.zhuanzhuan.aop.UserService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        System.out.println("用户的方法开始要执行了啊》》》》》方法名是："+method.getName());
    }
}
