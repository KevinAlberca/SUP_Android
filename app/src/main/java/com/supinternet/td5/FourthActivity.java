package com.supinternet.td5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.supinternet.td5.*;


/**
 * Created by AwH on 18/01/16.
 */
public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);

        Intent intent = getIntent();

        if (intent != null) {

        }
    }


    public void goToNextActivity(View v){
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }


}
