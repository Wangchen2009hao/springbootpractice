package com.zhuanzhuan;

import org.springframework.stereotype.Component;

/**
 * @author wangchen11
 * @date 2017年12月07日 23:13
 */
@Component
public class DemoAnnotationService {
    @LogAnoto(name = "注解式拦截")
    public void add(){};
}