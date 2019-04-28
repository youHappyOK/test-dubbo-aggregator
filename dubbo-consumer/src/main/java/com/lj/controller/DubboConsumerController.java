package com.lj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DubboProviderService;

@RestController
public class DubboConsumerController {

    @Autowired
    DubboProviderService dubboProviderService;

    @GetMapping("/consumer")
    public String invokeDubboProvider() {
        return dubboProviderService.dubboProvider();
    }
}
