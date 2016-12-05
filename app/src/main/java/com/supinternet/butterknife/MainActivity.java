package com.supinternet.butterknife;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.welcome_tv) TextView welcome_tv;
    @BindView(R.id.syntax_tv) TextView syntax_tv;
    @BindString(R.string.welcome_text) String welcome;
    @BindString(R.string.easier) String easier;
    @BindView(R.id.next) Button next;
    @BindView(R.id.show_button) Button show_button;
    @BindView(R.id.color_button) Button color_button;
    @BindViews({R.id.welcome_tv, R.id.syntax_tv}) List<TextView> textViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        show_button.setVisibility(View.INVISIBLE);
        color_button.setVisibility(View.INVISIBLE);

        welcome_tv.setText(welcome);
    }

    @OnClick(R.id.next) void learnMore() {
        welcome_tv.setText(easier);
        next.setVisibility(View.INVISIBLE);
        show_button.setVisibility(View.VISIBLE);
        color_button.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.show_button) void showAll() {
        welcome_tv.setText(welcome);
        syntax_tv.setText(easier);
    }

    @OnClick(R.id.color_button) void changeColor() {
        ButterKnife.apply(textViews, COLOR);
    }


    static final ButterKnife.Action<View> COLOR = new ButterKnife.Action<View>() {
        @Override public void apply(View view, int index) {
            view.setBackgroundColor(Color.BLUE);
        }
    };
}
