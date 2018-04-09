package com.zhuanzhuan.EL;

import com.sun.javafx.runtime.SystemProperties;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

/**
 * @author wangchen11
 * @date 2018年01月23日 1:05
 */
@Configuration
@ComponentScan("com.zhuanzhuan.EL")
@PropertySource("classpath:test.properties")
public class ELConfig {

    @Value("I love you")
    private String normal;

//    @Value("#{SystemProperties['os.name']}")
//    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    @Value("#{otherService.another}")
    private String fromAnother;

    @Value("classpath:test.txt")
    private Resource testFile;

    @Value("${book.name}")
    private String bookName;

    public void output(){
        try {
            //System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(bookName);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
