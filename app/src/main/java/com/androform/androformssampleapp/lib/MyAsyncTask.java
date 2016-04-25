package com.androform.androformssampleapp.lib;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import com.androform.androformssampleapp.R;

/**
 * Created by Jean-Philippe on 25/04/2016.
 */
public class MyAsyncTask extends AsyncTask<Void, Void, String> {
    private String mUrl;
    private MyAsyncCallback mCallback;

    public MyAsyncTask(MyAsyncCallback callback, String url) {
        mCallback = callback;
        mUrl = url;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mCallback.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... params) {
        String resultString = null;
        resultString = NetworkTools.getJSON(mUrl,2000);

        return resultString;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        mCallback.onPostExecute(result);
    }
}