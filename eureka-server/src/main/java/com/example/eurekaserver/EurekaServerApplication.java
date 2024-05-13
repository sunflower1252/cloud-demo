package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author YG
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
        System.out.println(
                "                      _                                             \n" +
                        "                     | |                                            \n" +
                        "   ___ _   _ _ __ ___| | ____ _ ______ ___  ___ _ ____   _____ _ __ \n" +
                        "  / _ \\ | | | '__/ _ \\ |/ / _` |______/ __|/ _ \\ '__\\ \\ / / _ \\ '__|\n" +
                        " |  __/ |_| | | |  __/   < (_| |      \\__ \\  __/ |   \\ V /  __/ |   \n" +
                        "  \\___|\\__,_|_|  \\___|_|\\_\\__,_|      |___/\\___|_|    \\_/ \\___|_|   \n");
    }
}
