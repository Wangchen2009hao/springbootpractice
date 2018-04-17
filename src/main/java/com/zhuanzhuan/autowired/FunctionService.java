package com.zhuanzhuan.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能文件
 */
@Service
public class FunctionService {
    public void sayHello(){
        System.out.println("Hello World!");
    }
}
