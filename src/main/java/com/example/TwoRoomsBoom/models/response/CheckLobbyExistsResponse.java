package com.example.TwoRoomsBoom.models.response;

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
public class CheckLobbyExistsResponse {
    private Boolean isJoin;
    private int status;
}
