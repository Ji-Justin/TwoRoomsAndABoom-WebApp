package com.example.TwoRoomsBoom.models;

import java.util.*;

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
    @Default
    private Game game = new Game();
    @Default
    private HashMap<Role, Integer> rolesAdded = new HashMap<>();
    @Default
    private List<Player> players = new ArrayList<>();
    @Default
    private Set<String> readyPlayers = new HashSet<String>();
    @Default
    private boolean enableBury = false;

    public Lobby(String uuid) {
        this.lobbyId = uuid;
        this.game = null;
        this.rolesAdded = new HashMap<>();
        this.players = new ArrayList<>();
        this.readyPlayers = new HashSet<>();
        this.enableBury = false;
    }

    public void startGame() {
        this.game = new Game();
    }

    public void addPlayers(Player player) {
        /* TODO: Possibly return boolean to indicate whether a player was added? */

        for (Player player1: this.players) {
            if(player1.getName().equals(player.getName())) {
                return;
            }
        }
        this.players.add(player);
    }

    public void kickPlayer(String playerName) {
        this.players.removeIf(player -> player.getName().equals(playerName));
    }

    public void addRole(Role role) {
        // Need to check that other roles besides team roles shouldn't be added more than once
        this.rolesAdded.compute(role, (k, val) -> val == null ? 1 : val + 1);
    }

    public void removeRole(Role role) {
        if (this.rolesAdded.get(role) != null) {
            this.rolesAdded.put(role, this.rolesAdded.get(role) - 1);
            if (this.rolesAdded.get(role) == 0) {
                this.rolesAdded.remove(role);
            }
        }
    }

    public void addReadyPlayer(String player) {
        this.readyPlayers.add(player);
    }

    public void removeReadyPlayer(String player) {
        this.readyPlayers.remove(player);
    }
    
    public void toggleBury() {
        if (this.enableBury) {
            this.enableBury = true;
        } else {
            this.enableBury = false;
        }
    }

    public boolean onConnectionCreate(Player player) {
        if (player.isConnected()) {
            if (players.isEmpty()) {
                player.makeHost();
            }
            this.addPlayers(player);
            // TODO: add logic to send to other users when another player is connected
            return true;
        }
        return false;
    }
}