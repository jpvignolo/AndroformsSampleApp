package com.androform.androformssampleapp.data;

import java.util.List;

/**
 * Created by Jean-Philippe on 26/04/2016.
 */
public class Answer {
    private String label;
    private List<Question> questions;

    public Answer() {
    }

    public Answer(String label, List<Question> questions) {
        this.label = label;
        this.questions = questions;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
