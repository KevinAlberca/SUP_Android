package com.supinternet.td11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button changeActivity;
    public TextView incTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.changeActivity = (Button) findViewById(R.id.button);
        this.incTextView = (TextView) findViewById(R.id.incrementTextView);

        this.incTextView.setText("" + IncrementerService.counter);

        this.changeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                IncrementerService iS = new IncrementerService();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);


            }
        });




    }




}
