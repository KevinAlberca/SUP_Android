package com.supinternet.tp7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        textView.startAnimation(fadeInAnimation);


        Button scale = (Button) findViewById(R.id.scaleButton);

        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scaleAnimation();
            }
        });

        Button translate = (Button) findViewById(R.id.translateButton);

        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                translateAnimation();
            }
        });

        Button rotate = (Button) findViewById(R.id.rotateButton);

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotateAnimation();
            }
        });
    }

    public void scaleAnimation() {
        TextView textView = (TextView) findViewById(R.id.textView);
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale);
        textView.startAnimation(scaleAnimation);
    }

    public void rotateAnimation() {
        TextView textView = (TextView) findViewById(R.id.textView);
        Animation rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        textView.startAnimation(rotateAnimation);
    }

    public void translateAnimation() {
        TextView textView = (TextView) findViewById(R.id.textView);
        Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate);
        textView.startAnimation(translateAnimation);
    }

}
