package com.example.TwoRoomsBoom.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private List<Player> players;
    private Player leader;
    private Chat chatBox;
}
