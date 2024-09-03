package com.example.TwoRoomsBoom.models.role;

import com.example.TwoRoomsBoom.models.Role;

public class Gambler extends Role{
    public Gambler() {
        this.setName("Gambler");
        this.setDescription("""
                At the end of the last round, 
                before all player cards are revealed, 
                you must announce what team won the game. 
                Win only if you are correct.
                """);
        this.setColor("Grey");
    }
    
}
