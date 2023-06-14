package com.yicj.hello.service;

import com.yicj.hello.HelloApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: yicj
 * @date: 2023/6/14 22:33
 */
@Slf4j
@SpringBootTest(classes = HelloApplication.class)
public class HelloServiceTest {

    @Autowired
    private HelloService helloService ;

    @Test
    public void hello(){
        String name = "张三" ;
        String retValue = helloService.hello(name);
        log.info("ret value : {}", retValue);
    }

}
