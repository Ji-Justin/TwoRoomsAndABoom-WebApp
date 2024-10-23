package com.example.TwoRoomsBoom.repositories;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.example.TwoRoomsBoom.models.Lobby;
import com.example.TwoRoomsBoom.models.Player;

@Repository
public class LobbyRepository {
    private final Map<String, Lobby> lobbies = new ConcurrentHashMap<>();

    public void createLobby(String id) {
        Lobby lobby = new Lobby(id);
        lobbies.put(id, lobby);
    }

    public boolean addPlayerToLobby(String id, Player player) throws IllegalArgumentException {
        Lobby lobby = lobbies.get(id);
        if (lobby != null) {
            return lobby.onConnectionCreate(player);// adds player to lobby websocketing
        }
        throw new IllegalArgumentException();
    }

    public boolean doesExist(String id) {
        return lobbies.containsKey(id);
    }

//    public void settingHostSessionId
}
