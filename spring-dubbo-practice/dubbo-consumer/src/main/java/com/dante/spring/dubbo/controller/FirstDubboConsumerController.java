package com.dante.spring.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dante.spring.dubbo.FirstDubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first_dubbo")
public class FirstDubboConsumerController {

    @Reference()
    private FirstDubboService firstDubboService;

    @RequestMapping("/sayHello")
    public void sayHello(){
        System.out.println( firstDubboService.sayHello() + " ,World! " );
    }
}
