package com.zhuanzhuan.aop;

import org.springframework.stereotype.Service;

/**
 * @author wangchen11
 * @date 2017年12月11日 20:56
 */
@Service
public class UserService {

    public void add(){
        System.out.println("  cmd=UserService.add ");
        
    }
}
