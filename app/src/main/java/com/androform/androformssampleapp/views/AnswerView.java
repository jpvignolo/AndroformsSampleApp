package com.androform.androformssampleapp.views;

import android.content.Context;
import android.widget.RelativeLayout;

import com.androform.androformssampleapp.data.Answer;

import java.util.List;

/**
 * Created by Jean-Philippe on 26/04/2016.
 */
public class AnswerView extends RelativeLayout {
    private List<Answer> answerList;

    public AnswerView(Context context) {
        super(context);
    }

    public AnswerView(Context context ,List<Answer> answerList) {
        super(context);
        this.answerList = answerList;
    }
}
