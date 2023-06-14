package com.yicj.hello;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: yicj
 * @date: 2023/6/14 22:24
 */
@Slf4j
@SpringBootTest(classes = HelloApplication.class)
public class HelloTest {

    @Test
    public void hello(){
        log.info("---------------");
    }
}
