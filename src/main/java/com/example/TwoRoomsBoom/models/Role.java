package com.example.TwoRoomsBoom.models;

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
public class Role {
    private String name;
    private String description;
    private String color;
    private String imagePath;
}
