package com.example.TwoRoomsBoom.models;

import java.util.List;
import java.util.Timer;

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
public class Game {
    private List<Round> rounds;
    private Timer timer;
    // Game State will go here (Need to implement what it will be state machine or simple enum)
}