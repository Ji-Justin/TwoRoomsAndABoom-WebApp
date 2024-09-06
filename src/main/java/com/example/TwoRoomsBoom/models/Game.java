package com.example.TwoRoomsBoom.models;

import com.example.TwoRoomsBoom.enums.GameStateEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder.Default;

import java.util.List;
import java.util.Timer;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private List<Round> rounds;
    private Timer timer;
    @Default
    private GameStateEnum GAMESTATE = GameStateEnum.GAME_WAITING_FOR_PLAYERS;
    private Room roomOne;
    private Room roomTwo;
}
