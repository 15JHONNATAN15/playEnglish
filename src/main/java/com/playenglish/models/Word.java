package com.playenglish.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Word {
    private Integer id;
    private String wordSpanish;
    private String wordEnglish;
    private Categorie categorie;

    public boolean validateWordSpanish(String input) {
        return this.wordSpanish.contains(input);
    }

    public boolean validateWordEnglish(String input) {
        return this.wordEnglish.contains(input);
    }
}
