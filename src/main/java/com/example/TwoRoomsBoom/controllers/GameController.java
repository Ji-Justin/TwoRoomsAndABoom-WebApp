package com.example.TwoRoomsBoom.controllers;

import com.example.TwoRoomsBoom.models.response.CheckLobbyExistsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import com.example.TwoRoomsBoom.models.request.CreateLobbyRequest;
import com.example.TwoRoomsBoom.models.response.CreateLobbyResponse;
import com.example.TwoRoomsBoom.services.LobbyService;




@RestController
public class GameController {
    @Autowired
    private LobbyService lobbyService;

    /*TODO: refactor rest controller
       to not create player object
     */
    @PostMapping("/create")
    @CrossOrigin(origins = "http://localhost:3000")
    public CreateLobbyResponse createLobby(@RequestBody CreateLobbyRequest request) {
        /*TODO: create lobby w/ unique id
                store lobby in data structure
        */
        String id = lobbyService.createLobby();
        return new CreateLobbyResponse(id, 200);
    }
    
    @GetMapping("check/{lobbyId}")
    public CheckLobbyExistsResponse checkLobby(@PathVariable String lobbyId) {
        /*TODO: check for lobby id in data structure
                if found add player to lobby
                  redirect to lobby
                else return error 
                  lobby cannot be found
        */
        Boolean exists = lobbyService.checkLobbyExists(lobbyId);
        if (exists) {
          return new CheckLobbyExistsResponse(exists, 200);
        } else {
          throw new HttpServerErrorException(HttpStatus.NOT_FOUND, "Lobby not found");
        }
    }
}
