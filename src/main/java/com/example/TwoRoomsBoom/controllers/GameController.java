package com.example.TwoRoomsBoom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import com.example.TwoRoomsBoom.models.request.CreateLobbyRequest;
import com.example.TwoRoomsBoom.models.response.CreateLobbyResponse;
import com.example.TwoRoomsBoom.models.response.JoinLobbyResponse;
import com.example.TwoRoomsBoom.services.LobbyService;




@RestController
public class GameController {
    @Autowired
    private LobbyService lobbyService;

    @PostMapping("/create")
    public CreateLobbyResponse createLobby(@RequestBody CreateLobbyRequest request) {
        /*TODO: create lobby w/ unique id
                store lobby in data structure
        */
        String id = lobbyService.createLobby(request.getPlayer());
        return new CreateLobbyResponse(id, 200);
    }
    
    @PutMapping("join/{gameid}")
    public JoinLobbyResponse joinLobby(@PathVariable String id, @RequestBody String name) {
        /*TODO: check for lobby id in data structure
                if found add player to lobby
                  redirect to lobby
                else return error 
                  lobby cannot be found
        */
        Boolean isJoin = lobbyService.joinLobby(id, name);
        if (isJoin) {
          return new JoinLobbyResponse(isJoin, 200);
        } else {
          throw new HttpServerErrorException(HttpStatus.NOT_FOUND, "Lobby not found");
        }
    }
    
    
}
