package com.zhuanzhuan._011条件注解Condition;

public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "windows ";
    }
}
