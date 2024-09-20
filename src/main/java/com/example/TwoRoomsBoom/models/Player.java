package com.example.TwoRoomsBoom.models;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private String name;
    @Default
    private Role role = null;
    @Default
    private Set<String> conditions = new HashSet<>();

    public Player(String name) {
        this.name = name;
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
