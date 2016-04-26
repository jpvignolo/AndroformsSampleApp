package com.androform.androformssampleapp.data;

import java.util.List;

/**
 * Created by Jean-Philippe on 26/04/2016.
 */
public class Question {
    private int id;
    private String label;
    private String type;
    private List<Answer> answers;

    public Question() {
    }

    public Question(int id, String label, String type, List<Answer> answers) {
        this.id = id;
        this.label = label;
        this.type = type;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
