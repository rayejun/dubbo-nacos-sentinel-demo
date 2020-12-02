package io.github.rayejun.sentinel.dubbo.consumer.demo.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import io.github.rayejun.sentinel.dubbo.demo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference
    DemoService demoService;

    @RequestMapping("hello")
    @SentinelResource(fallback = "fallback")
    public String hello() {
        return demoService.hello();
    }

    public String fallback() {
        return "熔断降级";
    }
}
