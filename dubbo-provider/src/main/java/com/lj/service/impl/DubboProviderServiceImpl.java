package com.lj.service.impl;

import com.lj.service.DubboProviderService;

public class DubboProviderServiceImpl implements DubboProviderService {

    @Override
    public String dubboProvider() {
        System.out.println("我被调用了，哥。。");
        return "这条消息来自 dubbo-provider";
    }
}
