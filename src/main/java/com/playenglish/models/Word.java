package com.playenglish.models;

import lombok.Data;

@Data
public class Word {
    private Integer id;
    private String nameSpanish;
    private String nameEnglish;
    private Categorie categorie;
}
