package com.yicj.hello.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author: yicj
 * @date: 2023/6/14 22:35
 */
@Slf4j
public class CommonUtilsTest {

    @Test
    public void hello(){
        var content = """
                hello 
                world bjs
                """ ;
        log.info("content : {}", content);
    }
}
