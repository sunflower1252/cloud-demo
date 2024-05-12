package com.example.orderserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @author YG
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
//    @Bean
//    public RestTemplate restTemplate(ClientHttpRequestFactory factory){
//        RestTemplate restTemplate= new RestTemplate(factory);
//        // 支持中文编码
//        restTemplate.getMessageConverters().set(1,
//                new StringHttpMessageConverter(Charset.forName("UTF-8")));
//        return restTemplate;
//
//    }
//
//    @Bean
//    public ClientHttpRequestFactory simpleClientHttpRequestFactory(){
//        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
//        factory.setReadTimeout(5000);//单位为ms
//        factory.setConnectTimeout(5000);//单位为ms
//        return factory;
//    }
}

