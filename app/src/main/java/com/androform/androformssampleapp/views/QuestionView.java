package com.androform.androformssampleapp.views;

import android.content.Context;
import android.widget.RelativeLayout;

import com.androform.androformssampleapp.data.Question;

import java.util.List;

/**
 * Created by Jean-Philippe on 26/04/2016.
 */
public class QuestionView  extends RelativeLayout {
    private Question question;

    public QuestionView(Context context) {
        super(context);
    }
    public QuestionView(Context context, Question question) {
        super(context);
        this.question = question;
    }
}
