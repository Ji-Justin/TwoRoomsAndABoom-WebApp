package com.example.TwoRoomsBoom.models.role;

import com.example.TwoRoomsBoom.models.Role;


public class RedTeam extends Role{
    public RedTeam() {
        this.setName("Red Team");
        this.setDescription("""
                You win if the *President* gains the **dead** condition.
                """);
        this.setColor("Red");
    }
}
