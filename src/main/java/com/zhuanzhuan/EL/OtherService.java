package com.zhuanzhuan.EL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author wangchen11
 * @date 2018年01月23日 1:21
 */
@Service
public class OtherService {
    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public OtherService setAnother(String another) {
        this.another = another;
        return this;
    }
}
