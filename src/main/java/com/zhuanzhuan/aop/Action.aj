package com.zhuanzhuan.aop;

/**
 *
 * @author wangchen11
 * @date 2018年01月23日 0:15
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 该注解用在方法上
@Retention(RetentionPolicy.RUNTIME)// 改注解运行时有效
public @interface Action {
    String name();
}
