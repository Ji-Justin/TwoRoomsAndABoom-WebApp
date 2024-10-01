package com.example.TwoRoomsBoom.models;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.socket.WebSocketSession;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private String name;
    @Default
    private Role role = null;
    @Default
    private Set<String> conditions = new HashSet<>();
    @Default
    private String sessionId = "";
    private WebSocketSession session;
    @Default
    private boolean host = false;

    public Player(String sessionId, String name) {
        this.sessionId = sessionId;
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    public void sharePublic() {
        
    }

    public void sharePrivate() {

    }

    public void shareColor() {

    }

    public void sendMessage() {

    }

    public void usurp() {
        
    }

    public void makeHost() {
        this.host = true;
    }

    public boolean isConnected() {
        return this.session != null && this.session.isOpen();
    }
}
