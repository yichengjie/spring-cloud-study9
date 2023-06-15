package com.yicj.springdoc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yicj
 * @date: 2023/6/15 22:03
 */
@RestController
@Tag(name="/getString")
public class SpringDocController {

    @GetMapping
    @Operation(summary = "This SpringDoc Test One.")
    public String getClients() {
        return "Hello First SpringDoc Application!";
    }
}
