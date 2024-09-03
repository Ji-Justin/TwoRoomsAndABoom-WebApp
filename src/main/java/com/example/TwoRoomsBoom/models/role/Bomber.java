package com.example.TwoRoomsBoom.models.role;

import com.example.TwoRoomsBoom.models.Role;

public class Bomber extends Role{
    public Bomber() {
        this.setName("Bomber");
        this.setDescription("""
                You are a primary character. 
                Everyone in the same room as you at the end of the game gains the **dead** condition. 
                The *Red Team* wins if the *President* gains the **dead** condition.
                """);
        this.setColor("Red");
    }
}
