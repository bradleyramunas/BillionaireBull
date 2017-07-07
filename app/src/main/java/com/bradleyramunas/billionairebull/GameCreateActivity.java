package com.bradleyramunas.billionairebull;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;

public class GameCreateActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_create);
        Intent request = getIntent();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getWindowManager().getDefaultDisplay();
        Point dimensions = new Point();
        display.getSize(dimensions);
        int newWidth = (int)Math.round(dimensions.x*0.9);
        int newHeight = (int)Math.round(dimensions.y*0.9);
        this.getWindow().setLayout(newWidth, newHeight);
    }

    public void onCasualSelect(View view){
        setResult(0);
    }

    public void onRealTimeSelect(View view){
        setResult(1);
    }

}
