package com.example.TwoRoomsBoom.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Timer;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Round {
    private HashMap<Player> hostages;
    private Timer timer;
    private Room roomOne;
    private Room roomTwo;
}
