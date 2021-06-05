package com.example.mybatis.websocket;


import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/*
基于STOMP协议的广播模式
开启websocket功能，控制器可用MessageMapping接收

AbstractWebSocketMessageBrokerConfigurer已经过时了
 */
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
         /*
        配置消息代理前缀/topic
         */
        registry.enableSimpleBroker("topic");//客户端接收服务端地址前缀(服务端发送地址的前缀)
        registry.setApplicationDestinationPrefixes("/app");//服务端接收客户端的前缀（客户端发送地址的前缀）
      }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
         /*
       注册STOMP节点并指定SockJS协议
       前端必须使用WebSocket对应节点如：var socket =new SockJS("/endpointWisely")

         */

     registry.addEndpoint("/endpointWisely").withSockJS();
    }
}
