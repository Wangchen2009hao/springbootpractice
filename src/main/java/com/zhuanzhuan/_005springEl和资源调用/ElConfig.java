package com.zhuanzhuan._005springEl和资源调用;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.zhuanzhuan._005springEl和资源调用")
@PropertySource("classpath:classpath:com/zhuanzhuan/_005springEl和资源调用/test.properties")
public class ElConfig {

    @Value("直接使用value 的方式注入")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:com/zhuanzhuan/_005springEl和资源调用/test.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    public void outputStream(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testUrl.getInputStream()));

//            System.out.println(IOUtils.toString(testFile.getInputStream()));// 这个不好使是应为这个文件没有被放到 class 下面，手动拷贝到下面好用
            System.out.println(bookName);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
