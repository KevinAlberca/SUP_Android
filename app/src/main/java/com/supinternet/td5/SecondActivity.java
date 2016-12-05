package com.supinternet.td5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.supinternet.td5.*;
import org.w3c.dom.Text;

/**
 * Created by AwH on 18/01/16.
 */

public class SecondActivity  extends AppCompatActivity {

    public static final String EXTRA_TEXT = "EXTRA_TEXT";
    protected TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        textView = (TextView)findViewById(R.id.second_activity_userInput);

        Intent intent = getIntent();

        if (intent != null) {
            if (intent.getStringExtra(EXTRA_TEXT) != null){
                this.textView.setText(intent.getStringExtra(EXTRA_TEXT));
            }
        }

    }

    public void goToNextActivity(View v){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
