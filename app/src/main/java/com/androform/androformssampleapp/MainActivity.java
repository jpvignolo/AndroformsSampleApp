package com.androform.androformssampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.androform.androformssampleapp.lib.MyAsyncCallback;
import com.androform.androformssampleapp.lib.MyAsyncTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAsyncTask getSuscribeForm = new MyAsyncTask(new MyAsyncCallback() {
            @Override
            public void onPreExecute() {
;
            }

            @Override
            public void onPostExecute(String result) {
                Log.d("MainActivity",result);
            }
        },getResources().getString(R.string.suscribe_url));

        getSuscribeForm.execute();
    }
}
