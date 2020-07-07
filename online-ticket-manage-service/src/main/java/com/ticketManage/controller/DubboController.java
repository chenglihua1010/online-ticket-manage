package com.ticketManage.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import com.ticket.api.service.DubboService1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class DubboController {
        @Reference
        DubboService1 dubboService1;
        @RequestMapping("/say")
        public void say(){
                System.out.println("dddd");
                dubboService1.sayHello("dddddd");
        }



}