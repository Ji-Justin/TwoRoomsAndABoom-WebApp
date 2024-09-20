package com.example.TwoRoomsBoom.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TwoRoomsBoom.repositories.LobbyRepository;

@Service
public class LobbyService {
    @Autowired
    private LobbyRepository lobbyRepository;

    public String createLobby(String hostName) {
        String uuid = UUID.randomUUID().toString();
        lobbyRepository.createLobby(uuid, hostName);
        // add scheduler
        return uuid;
    }

    public boolean joinLobby(String id, String name) {
        try {
            return lobbyRepository.addPlayerToLobby(id, name);
        } catch(IllegalArgumentException er) {
            return false;
        }
    }
}
