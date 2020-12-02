//package io.github.rayejun.sentinel.dubbo.consumer.demo.config;
//
//import com.alibaba.csp.sentinel.adapter.dubbo.config.DubboAdapterGlobalConfig;
//import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
//import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
//import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
//import com.alibaba.csp.sentinel.slots.block.degrade.circuitbreaker.CircuitBreakerStrategy;
//import org.apache.dubbo.rpc.AsyncRpcResult;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//import java.util.Collections;
//
//@Configuration
//public class SentinelConfig {
//
//    @Bean
//    public BlockExceptionHandler sentinelBlockExceptionHandler() {
//        return (request, response, e) -> {
//            response.setContentType("application/json;charset=UTF-8");
//            response.getWriter().write("请求繁忙，请稍后再试！");
//        };
//    }
//
//    private static final String RES_KEY = "io.github.rayejun.sentinel.dubbo.demo.service.DemoService";
//
//    @PostConstruct
//    private void initDegradeRule() {
//        DegradeRule rule = new DegradeRule(RES_KEY)
//                .setGrade(CircuitBreakerStrategy.SLOW_REQUEST_RATIO.getType())
//                // Max allowed response time
//                .setCount(10)
//                // Retry timeout (in second)
//                .setTimeWindow(5)
//                // Circuit breaker opens when slow request ratio > 60%
//                .setSlowRatioThreshold(0.6)
//                .setMinRequestAmount(100)
//                .setStatIntervalMs(20000);
//        DegradeRuleManager.loadRules(Collections.singletonList(rule));
//    }
//
//    @PostConstruct
//    public void consumerFallback() {
//        DubboAdapterGlobalConfig.setConsumerFallback((invoker, invocation, ex) -> AsyncRpcResult.newDefaultAsyncResult("consumer服务器处理不过来了", invocation));
//    }
//}
