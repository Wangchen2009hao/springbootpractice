package com.zhuanzhuan.test;

/**
 * @author wangchen11
 * @date 2018年01月26日 23:05
 */
public class TestBean {
    private String content;


    public TestBean(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public TestBean setContent(String content) {
        this.content = content;
        return this;
    }
}
