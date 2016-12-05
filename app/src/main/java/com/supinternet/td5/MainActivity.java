package com.supinternet.td5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.supinternet.td5.*;

public class MainActivity extends AppCompatActivity {

    protected Button changeActivity;
    public EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.main_activity_changeActivity);

        final EditText editText = (EditText) findViewById(R.id.main_activity_userInput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_TEXT, editText.getText().toString());
                startActivity(intent);

            }
        });

    }
}
