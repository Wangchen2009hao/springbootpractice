package com.zhuanzhuan._003AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class AopAspect {

    /**
     * 切入点可以设置多个，执行顺序是按照方法的名字来的
     */
    @Before("execution(* com.zhuanzhuan._003AOP.FunctionService.*(..))")
    public void aefore(){
        System.out.println("=======前置拦截2========");
    }

    /**
     * 我要对 FunctionService 做一个前置校验
     * 注意，匹配返回值的 * 后面要有一个空格
     */
    @Before("execution(* com.zhuanzhuan._003AOP.FunctionService.*(..))")
    public void before1(){
        System.out.println("=======前置拦截============");
    }

    /**
     * 这样直接用一个注解是可以的
     */
    @After("@annotation(com.zhuanzhuan._003AOP.Action)")
    public void after(){
        System.out.println("====后置拦截====");
    }

    @Pointcut("@annotation(com.zhuanzhuan._003AOP.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after2(){
        System.out.println("=====后置拦截2====");
    }

    @After("annotationPointCut()")
    public void after3(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        System.out.println("======methodname "+method.getName());

        Action annotation = method.getAnnotation(Action.class);

        System.out.println("======注解方式的拦截 "+annotation.name());
    }

}
