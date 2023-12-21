package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cooking {
    private int id;
    private String author;
    private String ingredient;
    private int time;
    private String difficulty;
    private String foodtype;
    private String instruction;
    private String calories;
    private String tips;
    private String caution;
}
