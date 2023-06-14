package com.yicj.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yicj
 * @date: 2023/6/14 22:56
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class HelloClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloClientApplication.class, args) ;
    }
}
