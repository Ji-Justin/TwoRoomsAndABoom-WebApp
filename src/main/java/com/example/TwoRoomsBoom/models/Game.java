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
    private int currentRound = 0;
    private int totalRounds = 3; //Set up by settings
    @Default
    private GameStateEnum GAMESTATE = GameStateEnum.GAME_WAITING_FOR_PLAYERS;

    //HELPER FUNCTIONS

    private

    //Main Game Loop
    private void GameLoop() {
        if(GAMESTATE.equals(GameStateEnum.GAME_WAITING_FOR_PLAYERS)) {
            return;
        }

        while(!GAMESTATE.equals(GameStateEnum.GAME_END)) {
            //Check to see if the

            switch (GAMESTATE.name()) {
                case "GAME_READY": break;
                case "GAME_START": break;
                case "GAME_ROUND_START": break;
                case "GAME_TIMER_START": break;
                case "GAME_TIMER_END": break;
                case "GAME_VOTING_START": break;
                case "GAME_VOTING_END": break;
                case "GAME_HOSTAGE_EXCHANGE_START": break;
                case "GAME_HOSTAGE_EXCHANGE_END": break;
                case "GAME_ROUND_END": break;
            }
        }
    }
}
