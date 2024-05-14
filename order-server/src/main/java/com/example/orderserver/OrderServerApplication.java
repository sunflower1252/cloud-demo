package com.example.orderserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author YG
 */
@EnableFeignClients(basePackages = "com.example.feignapi.client")
/*
 * 加上(basePackages = "com.example.feignapi.client")是因为feign之前启动的时候，client包是在同一个模块里面，所以不需要加
 * 但是现在client在feign-api模块里面，所以需要添加，扩大spring的扫描路径
 */
@EnableEurekaServer
@SpringBootApplication
@MapperScan("com.example.orderserver.mapper")
public class OrderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServerApplication.class, args);
        System.out.println(
                "                _                                               \n" +
                        "               | |                                              \n" +
                        "   ___  _ __ __| | ___ _ __ ______ ___  ___ _ ____   _____ _ __ \n" +
                        "  / _ \\| '__/ _` |/ _ \\ '__|______/ __|/ _ \\ '__\\ \\ / / _ \\ '__|\n" +
                        " | (_) | | | (_| |  __/ |         \\__ \\  __/ |   \\ V /  __/ |   \n" +
                        "  \\___/|_|  \\__,_|\\___|_|         |___/\\___|_|    \\_/ \\___|_|   \n");
    }

}
