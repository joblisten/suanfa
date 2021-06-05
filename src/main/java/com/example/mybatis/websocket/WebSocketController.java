package com.example.mybatis.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.util.concurrent.CopyOnWriteArraySet;

@Controller
public class WebSocketController {
    @MessageMapping("/app/welcome")//通过前端里stomp.send('welcome')从浏览器获取信息如name
    @SendTo("/topic/getResponse")//订阅服务端接收的消息，再发送到其他浏览器，前端会有stompClient.subscribe('/topic/getResponse')
    public WiselyResponse say(WiselyMessage message) throws InterruptedException {

        Thread.sleep(3000);
        return new WiselyResponse("welcome"+message.getName());

    }
    /*
       定时器，通过后端定时，实现前端和服务端的轮训
      也可以用ajax
        */
   
}
