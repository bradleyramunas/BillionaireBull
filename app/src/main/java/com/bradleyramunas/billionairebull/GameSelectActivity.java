package com.bradleyramunas.billionairebull;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_select);
    }

    public void onCreateNewGameSelect(View view){
        Intent launchGameSelectActivityIntent = new Intent(this, GameCreateActivity.class);
        startActivityForResult(launchGameSelectActivityIntent, 1);
    }
}
