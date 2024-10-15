package com.example.TwoRoomsBoom.config;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.TwoRoomsBoom.services.WebSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer{

    public static final Logger LOGGER = LoggerFactory.getLogger(WebSocketConfig.class);

    @Autowired
    private WebSocketHandler handler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        LOGGER.debug("Custom WS");
        webSocketHandlerRegistry.addHandler(handler, "/ws")
                .setAllowedOriginPatterns("*");
    }

}
