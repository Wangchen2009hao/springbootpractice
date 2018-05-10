package com.zhuanzhuan._003AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 */
@Configuration
@ComponentScan("com.zhuanzhuan._003AOP")
@EnableAspectJAutoProxy // 开启 spring 对 aspectJ 的支持！
public class AopConfig {
}
