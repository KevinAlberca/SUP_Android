package hello.supinternet.com.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.lang.String;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private String elements[] = {"Froyo", "Jelly Beans","KitKat", "Lollipop", "Marshmallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillViews();

    }

    private void fillViews(){
        textView = (TextView) findViewById(R.id.activity_main_text);
        button = (Button) findViewById(R.id.activity_main_button);

        textView.setText("Hello You !");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int max = (int)(Math.random() * elements.length);

                textView.setText(elements[max]);
            }
        });
    }
}
