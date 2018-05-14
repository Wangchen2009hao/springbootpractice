package com.zhuanzhuan._011条件注解Condition;

public class MacListService implements ListService{
    @Override
    public String showListCmd() {
        return "Mac";
    }
}
