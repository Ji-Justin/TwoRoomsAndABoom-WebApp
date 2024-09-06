package com.example.TwoRoomsBoom.models;

import java.util.Set;

import com.example.TwoRoomsBoom.models.role.*;

import java.util.Iterator;
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
    private List<Role> rolesAdded;
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
        // Can have multiple Blue/Red team role in play but other roles cannot
        if (role.getName().equals("Blue Team") || role.getName().equals("Red Team")) {
            // Should be equal amount of Blue/Red team added
            if (role.getName().equals("Blue Team")) {
                this.rolesAdded.add(new RedTeam());
            } else {
                this.rolesAdded.add(new BlueTeam());
            }
            this.rolesAdded.add(role);
        } else if (!this.rolesAdded.contains(role)) {
            this.rolesAdded.add(role);
        }
    }

    public void removeRole(Role role) {
        if (this.rolesAdded.size() > 0 && this.rolesAdded.contains(role)) {
            // Removes both Blue/Red Team
            if (role.getName().equals("Blue Team") || role.getName().equals("Red Team")) {
                Iterator<Role> iter = rolesAdded.iterator();
                while (iter.hasNext()) {
                    Role r = iter.next();
                    if ((role.getName().equals("Blue Team") && r.getName().equals("Red Team")) || 
                        (role.getName().equals("Red Team") && r.getName().equals("Blue Team"))) {
                        iter.remove();
                    }
                }
                this.rolesAdded.remove(role);
            } else {
                this.rolesAdded.remove(role);
            }
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