package com.samples.ui.chronometer;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

public class ChronometerActivity extends Activity implements View.OnClickListener {

    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chronometer);

        chronometer = (Chronometer)findViewById(R.id.chronometer);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_Start:
                chronometer.start();
                break;
            case R.id.button_Stop:
                chronometer.stop();
                break;
            case R.id.button_Reset:
                chronometer.setBase(SystemClock.elapsedRealtime());
                break;
        }
    }
}
