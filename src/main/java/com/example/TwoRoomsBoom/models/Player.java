package com.example.TwoRoomsBoom.models;

import java.util.Set;

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
public class Player {
    private String name;
    private Role role;
    private Set<String> conditions;
    private Integer room;
    @Default
    private boolean isLeader = false;
    private boolean isHost;
    
    public void changeRoom() {
        if (this.room == 1) {
            this.room = 2;
        } else {
            this.room = 1;
        }
    }

    public void sharePublic() {
        
    }

    public void sharePrivate() {

    }

    public void shareColor() {

    }

    public void sendMessage() {

    }

    public void usurp() {
        
    }
}
