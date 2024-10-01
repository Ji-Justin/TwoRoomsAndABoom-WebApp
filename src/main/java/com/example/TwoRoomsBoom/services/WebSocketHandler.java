package com.example.TwoRoomsBoom.services;

import com.example.TwoRoomsBoom.repositories.UrlParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Map;
import java.util.Optional;

public class WebSocketHandler extends TextWebSocketHandler {

    @Autowired
    private UrlParser urlParser;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        try {
            // UUID lobby code
            Map<String, String> uriQuery = urlParser.parse(session.getUri());
            String lobbyid = Optional.ofNullable(uriQuery.get("lobbyid")).orElseThrow(IllegalArgumentException::new);
            String playername = Optional.ofNullable(uriQuery.get("name")).orElseThrow(IllegalArgumentException::new);
            // Add connection to collection

        } catch () {

        } catch () {

        }
    }
}
