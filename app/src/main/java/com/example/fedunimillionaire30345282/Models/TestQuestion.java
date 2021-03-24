package com.example.fedunimillionaire30345282.Models;

import java.util.ArrayList;

public class TestQuestion {
    private String Question;
    private ArrayList<Choices> choices;

    public String getQuestion() {
        return Question;
    }

    public ArrayList<Choices> getChoices() {
        return choices;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public void setChoices(ArrayList<Choices> choices) {
        this.choices = choices;
    }
}
