package com.zhuanzhuan._006Bean的初始化和销毁;

public class BeanWayService {
    public void init(){
        System.out.println("BeanWayService  初始化方法");
    }

    public BeanWayService() {
        System.out.println("BeanWanService 构造方法");
    }

    public void destroy(){
        System.out.println("BeanWayService  销毁方法");
    }

}
