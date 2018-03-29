package com.dante.spring.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dante.spring.dubbo.FirstDubboService;

@Service(timeout = 2000)
public class FirstDubboServiceImpl implements FirstDubboService {

    @Override
    public String sayHello() {
        int key = 1/0;
        Object n = null;
        n.toString();
        n.toString();
        return null;
    }
}
