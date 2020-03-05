package com.yywz.controller;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMQ {

    @Autowired
    private AmqpTemplate rabbitAmqpTemplate;
    
    //exchange 交换器名称
    //@Value("${mq.config.exchange}")
    //private String exchange;
    
    //routingkey 路由键
    //@Value("${mq.config.queue.info.routing.key}")
    //private String routingkey;
    /*
     * 发送消息的方法
     */
    @RequestMapping("/send")
    public String send(){
            String content = "hello" + new Date();
            System.out.println("Sender:" +content);
            this.rabbitAmqpTemplate.convertAndSend("hello", content);
            return "success";

    }
    
    
}
