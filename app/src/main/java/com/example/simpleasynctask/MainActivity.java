package com.example.simpleasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ThreadTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new ExampleTask().execute();
        //for (int i = 0; i < 100; i++) {
          //  try {
            //    Thread.sleep(1000);
              //  Log.d(TAG, "onCreate: " + i);
            //} catch (InterruptedException e) {
              //  e.printStackTrace();
            //}
        //}

        }

    @Override
    protected void onResume() {
        super.onResume();
      //  for (int i = 0; i < 5; i++) {
        //    try {
          //      Thread.sleep(1000);
            //    Log.d(TAG, "onResume: " + i);
            //} catch (InterruptedException e) {
              //  e.printStackTrace();
           // }
       // }
    }

    public void doMagic(View view) {
        Log.d(TAG, "onClick: " + Thread.currentThread());
    }
}

