package com.example.TwoRoomsBoom.models;

import java.util.Set;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder.Default;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Lobby {
    private String lobbyId;
    private List<Role> rolesAdded;
    private List<Player> players;
    private Set<Player> readyPlayers;
    private Player host;
    private String settings;
}