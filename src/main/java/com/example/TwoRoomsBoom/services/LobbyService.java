package com.example.TwoRoomsBoom.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TwoRoomsBoom.repositories.LobbyRepository;

@Service
public class LobbyService {
    @Autowired
    private LobbyRepository lobbyRepository;

    public String createLobby() {
        String uuid = UUID.randomUUID().toString();
        lobbyRepository.createLobby(uuid);
        // add scheduler
        return uuid;
    }

    public boolean checkLobbyExists(String id) {
        return lobbyRepository.doesExist(id);
    }
}
