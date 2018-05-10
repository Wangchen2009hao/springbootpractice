package com.zhuanzhuan._003AOP;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)// 默认情况下是 class 可用
@Target(ElementType.METHOD)
public @interface Action {
    String name();
}
