package com.yicj.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: yicj
 * @date: 2023/6/14 22:39
 */
@EnableEurekaServer
@SpringBootApplication
public class HelloServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloServerApplication.class) ;
    }
}
