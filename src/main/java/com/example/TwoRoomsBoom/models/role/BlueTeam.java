package com.example.TwoRoomsBoom.models.role;

import com.example.TwoRoomsBoom.models.Role;

public class BlueTeam extends Role{
    public BlueTeam() {
        this.setName("Blue Team");
        this.setDescription("""
                You win if the *President* does not gain the **dead** condition.
                """);
        this.setColor("Blue");
    }
    
}
