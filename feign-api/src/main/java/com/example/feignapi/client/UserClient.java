package com.example.feignapi.client;

import com.example.feignapi.domain.TbUser;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author YG
 * <p>
 * feign客户端来代替RestTemplate进行消费者的调用
 * 解决了硬编码的问题
 */
@FeignClient("feign-api")
public interface UserClient {

    @GetMapping("/TbUser/{userid}")
    @LoadBalanced
        // 注意！！！
        // 此处加了@LoadBalanced注解，是因为feign代替了RestTemplate
        // 因为RestTemplate加了注解含有负载均衡，所以可以进行消费者接口的调用
        // 但是feign不包含负载均衡，所以要添加此注解！！！
    TbUser getTbUser(@PathVariable("userid") Integer id);

}



