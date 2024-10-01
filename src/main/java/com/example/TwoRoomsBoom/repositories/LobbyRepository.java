package com.example.TwoRoomsBoom.repositories;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.example.TwoRoomsBoom.models.Lobby;
import com.example.TwoRoomsBoom.models.Player;

@Repository
public class LobbyRepository {
    private final Map<String, Lobby> lobbies = new ConcurrentHashMap<>();

    public void createLobby(String id, String hostName) {
        Player host = new Player(hostName);
        Lobby lobby = new Lobby(id, host);
        lobbies.put(id, lobby);
        this.addPlayerToLobby(id, host);
    }

    public boolean addPlayerToLobby(String id, Player player) throws IllegalArgumentException {
        Lobby lobby = lobbies.get(id);
        if (lobby != null) {
            lobby.addPlayers(player);
//            System.out.println(lobby.getPlayers().toString());
            return true; // add player to lobby websocketing
        }
        throw new IllegalArgumentException();
    }

    public void settingHostSessionId
}
