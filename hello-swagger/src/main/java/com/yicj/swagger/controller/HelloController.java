package com.yicj.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yicj
 * @date: 2023/6/15 21:30
 */
@Api(tags = "APP-微信消息推送助手")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @ApiOperation(value = "推送：每天定时推送微信消息", notes = "api/push/message", response = String.class)
    @GetMapping("/hello")
    public String hello(@ApiParam(value = "姓名", required = true) String name){

        return "hello, " + name ;
    }

}
