package com.playenglish.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Player {
    private Integer id;
    private String name;
    private Integer score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public Integer riseScore(int points) {
        return this.score += points;
    }

    public Integer decreaseScore(int points) {
        int i = this.score > 0 ? this.score -= points : this.score;
        return i;
    }

    public void resetScore() {
        this.score = 0;
    }
}
