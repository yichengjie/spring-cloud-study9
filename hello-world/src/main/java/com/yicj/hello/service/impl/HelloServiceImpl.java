package com.yicj.hello.service.impl;

import com.yicj.hello.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author: yicj
 * @date: 2023/6/14 22:32
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello, " + name ;
    }
}
