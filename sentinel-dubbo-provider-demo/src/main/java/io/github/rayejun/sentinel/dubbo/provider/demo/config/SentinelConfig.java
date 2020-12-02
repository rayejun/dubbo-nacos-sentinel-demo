//package io.github.rayejun.sentinel.dubbo.provider.demo.config;
//
//import com.alibaba.csp.sentinel.adapter.dubbo.config.DubboAdapterGlobalConfig;
//import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
//import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
//import com.alibaba.csp.sentinel.slots.block.degrade.circuitbreaker.CircuitBreakerStrategy;
//import org.apache.dubbo.rpc.AsyncRpcResult;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.PostConstruct;
//import java.util.Collections;
//
//@Configuration
//public class SentinelConfig {
//
//    @PostConstruct
//    private void providerFallback() {
//        DubboAdapterGlobalConfig.setProviderFallback((invoker, invocation, ex) -> AsyncRpcResult.newDefaultAsyncResult("provider服务器处理不过来了", invocation));
//    }
//}
