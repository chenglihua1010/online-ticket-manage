package com.ticketManage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ticketManage.api.service.DubboService;


@Service
public class DubboServiceImpl implements DubboService {
    @Override
    public void sayHello(String name) {
        System.out.println(name);
        System.out.println("---dubbo 我是online-ticket-manage的服务--222222--");
    }
}
