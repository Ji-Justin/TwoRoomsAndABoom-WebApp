package com.example.TwoRoomsBoom.models.role;

import com.example.TwoRoomsBoom.models.Role;

public class President extends Role{
    public President() {
        this.setName("President");
        this.setDescription("""
                You are a primary character. 
                *Blue Team* wins if you do not gain the **dead** condition.
                """);
        this.setColor("Blue");
    }
}
