package com.playenglish.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    Word zapatos;

    @BeforeEach
    void setUp() {
        zapatos = new Word(1, "zapatos", "shoes", new Categorie(1, "clothes"));
    }

    @Test
    @DisplayName("Validate the entry of a word in Spanish with an OK result")
    void testValidateCorrectWordInSpanish() {
        assertTrue(zapatos.validateWordSpanish("zapatos"));
    }

    @Test
    @DisplayName("Validate the entry of a word in Spanish with an erroneous result")
    void testValidateWrongWordInSpanish() {
        assertTrue(zapatos.validateWordSpanish("zapatos"));
    }

    @Test
    @DisplayName("Validate the entry of a word in English with an OK result")
    void testValidateCorrectWordInEnglish() {
        assertTrue(zapatos.validateWordEnglish("shoes"));
    }

    @Test
    @DisplayName("Validate the entry of a word in English with an erroneous result")
    void testValidateWrongWordInEnglish() {
        assertFalse(zapatos.validateWordEnglish("store"));
    }
}