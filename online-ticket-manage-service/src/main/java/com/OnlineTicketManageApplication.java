package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import tk.mybatis.spring.annotation.MapperScan;

@ImportResource("classpath:spring-mybatis.xml")      //导入xml配置
@MapperScan(basePackages = "com.ticketManage.mapper")
@ComponentScan(basePackages ={"com.ticketManage"} )

@SpringBootApplication
public class OnlineTicketManageApplication {
    public static void main(String[] args){
        SpringApplication.run(OnlineTicketManageApplication.class,args);
    }
}
