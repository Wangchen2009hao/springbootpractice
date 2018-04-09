package com.zhuanzhuan.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangchen11
 * @date 2017年12月11日 20:51
 */
@Configuration
@ComponentScan("com.zhuanzhuan.aop")
@EnableAspectJAutoProxy // 开启对 AspectJ 的支持
public class AppConfig {
}
