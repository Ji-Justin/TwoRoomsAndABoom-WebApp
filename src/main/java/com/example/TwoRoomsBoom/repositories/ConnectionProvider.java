package com.example.TwoRoomsBoom.repositories;

import com.example.TwoRoomsBoom.models.Player;
import org.springframework.stereotype.Repository;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

@Repository
public class ConnectionProvider {
    private final Map<String, Player> connections = new HashMap<>();

    public void addConnection(WebSocketSession session, String lobbyid, String playerName, BiFunction<String, Player, Boolean> acceptor) throws UnsupportedOperationException {
        Player player = new Player(session, session.getId(), playerName);
        if (acceptor.apply(lobbyid, player)) {
            connections.put(session.getId(), player);
        } else throw new UnsupportedOperationException();
    }
}
