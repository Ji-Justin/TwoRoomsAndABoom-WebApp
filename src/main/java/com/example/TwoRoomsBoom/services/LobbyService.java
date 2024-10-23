package com.example.TwoRoomsBoom.services;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TwoRoomsBoom.repositories.LobbyRepository;

@Service
public class LobbyService {
    @Autowired
    private LobbyRepository lobbyRepository;

    public String createLobby() {
        // String uuid = UUID.randomUUID().toString();
        String code = RandomStringUtils.randomAlphanumeric(5);
        lobbyRepository.createLobby(code);
        // add scheduler
        return code;
    }

    public boolean checkLobbyExists(String id) {
        return lobbyRepository.doesExist(id);
    }
}
