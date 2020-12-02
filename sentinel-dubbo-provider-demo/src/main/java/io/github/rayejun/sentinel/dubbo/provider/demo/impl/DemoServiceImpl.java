package io.github.rayejun.sentinel.dubbo.provider.demo.impl;

import io.github.rayejun.sentinel.dubbo.demo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String hello() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "hello";
    }
}
