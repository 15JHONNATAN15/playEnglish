package com.playenglish.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player juan;

    @BeforeEach
    void setUp() {
        juan = new Player("juan");
    }

    @Test
    @DisplayName("Ensure correct rise score")
    void testOfRiseScoreCorrectly() {
        assertEquals(8, juan.riseScore(8));
    }

    @Test
    @DisplayName("Ensure correct decrease score")
    void tesTOfDecreaseScoreCorrectly() {
        juan.riseScore(8);
        assertEquals(2, juan.decreaseScore(6));
    }

    @Test
    @DisplayName("Ensure correct reset score")
    void tesTResetScore() {
        juan.resetScore();
        assertEquals(0, juan.getScore());
    }
}