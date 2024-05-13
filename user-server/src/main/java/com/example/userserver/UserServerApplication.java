package com.example.userserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author YG
 */
@EnableEurekaServer
@SpringBootApplication
@MapperScan("com.example.userserver.mapper")
public class UserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServerApplication.class, args);
        System.out.println(
                "  _   _ ___  ___ _ __ ______ ___  ___ _ ____   _____ _ __ \n" +
                        " | | | / __|/ _ \\ '__|______/ __|/ _ \\ '__\\ \\ / / _ \\ '__|\n" +
                        " | |_| \\__ \\  __/ |         \\__ \\  __/ |   \\ V /  __/ |   \n" +
                        "  \\__,_|___/\\___|_|         |___/\\___|_|    \\_/ \\___|_|   \n");
    }

}
