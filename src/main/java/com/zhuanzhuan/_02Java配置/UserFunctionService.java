package com.zhuanzhuan._02Java配置;

// 注意注意，这里没有注解
//@Service
public class UserFunctionService {
    FunctionService functionService;

    public FunctionService getFunctionService() {
        return functionService;
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public void sayHello(){
        functionService.sayHello();
    }
}
