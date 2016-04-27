package com.androform.androformssampleapp.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

import com.androform.androformssampleapp.R;
import com.androform.androformssampleapp.data.Answer;
import com.androform.androformssampleapp.data.Question;
import com.androform.androformssampleapp.lib.MyAsyncCallback;
import com.androform.androformssampleapp.lib.MyAsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by Jean-Philippe on 27/04/2016.
 */
public class QAView extends RelativeLayout {

    public QAView(Context context) {
        super(context);
    }

    public QAView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public QAView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @TargetApi(21)
    public QAView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs!=null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.QAView);
            String url = a.getString(R.styleable.QAView_url);
            if (url!=null) {

                MyAsyncTask getSuscribeForm = new MyAsyncTask(new MyAsyncCallback() {
                    @Override
                    public void onPreExecute() {
                        ;
                    }

                    @Override
                    public void onPostExecute(String result) {
                        Log.d("MainActivity",result);
                        try {
                            JSONObject jObject = new JSONObject(result);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },getResources().getString(R.string.suscribe_url));

                getSuscribeForm.execute();
            }
            a.recycle();
        }
    }
}
