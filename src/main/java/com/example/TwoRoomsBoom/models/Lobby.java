package com.example.TwoRoomsBoom.models;

import java.util.Set;
import java.util.HashMap;
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
    private Game game;
    private HashMap<Role, Integer> rolesAdded;
    private List<Player> players;
    private Set<Player> readyPlayers;
    private Player host;
    @Default
    private boolean enableBury = false;

    public void startGame() {
        this.game = new Game();
    }

    public void addPlayers(Player player) {
        if (!this.players.contains(player)) {
            this.players.add(player);
        }
    }

    public void kickPlayer(Player player) {
        if (this.players.contains(player)) {
            this.players.remove(player);
        }
    }

    public void addRole(Role role) {
        // Need to check that other roles besides team roles shouldn't be added more than once
        rolesAdded.compute(role, (k, val) -> val == null ? 1 : val + 1);
    }

    public void removeRole(Role role) {
        if (rolesAdded.get(role) != null) {
            rolesAdded.remove(role);
        }
    }

    public void addReadyPlayer(Player player) {
        if (!this.readyPlayers.contains(player)) {
            this.readyPlayers.add(player);
        }
    }

    public void removeReadyPlayer(Player player) {
        if (this.readyPlayers.contains(player)) {
            this.readyPlayers.remove(player);
        }
    }
    
    public void toggleBury() {
        if (this.enableBury) {
            this.enableBury = true;
        } else {
            this.enableBury = false;
        }
    }

    public void transferHost(Player player) {
        this.host = player;
    }
}