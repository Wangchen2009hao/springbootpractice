package com.zhuanzhuan.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author wangchen11
 * @date 2018年01月23日 23:37
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware{

    private String beanName;

    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outPut() throws IOException {
        System.out.println("这个 Bean 在 Spring 中的名字是："+beanName);
        Resource resource = resourceLoader.getResource("classpath:test.txt");
        System.out.println(IOUtils.toString(resource.getInputStream()));

        Resource resource2 = resourceLoader.getResource("classpath:test.properties");
        System.out.println(IOUtils.toString(resource2.getInputStream()));
    }
}
