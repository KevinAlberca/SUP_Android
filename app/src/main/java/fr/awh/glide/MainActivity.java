package fr.awh.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.position)
    TextView position_tv;
    private Integer position = 0;

    private List img = new ArrayList(){{
        add(R.drawable.antman);
        add("http://blog.mothershaker.com/wp-content/uploads/2015/01/27_captain-america.gif");
        add(R.drawable.ironman);
        add("http://www.marvel-world.com/contents/encyclopedie/biographies/h/hulk/hulk_0.jpg");
        add("http://www.mightythorlibrary.com/superhero-library/Img/Characters/THOR-profile.jpg");
    }};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        position_tv.setText(position.toString());
        Glide.with(this).load(img.get(0)).into(imageView);
    }

    @OnClick(R.id.prev_btn) public void previousImage() {
        if(position == 0) {
            position = img.size() - 1;
        } else {
            position = position - 1;
        }
        Glide.with(this).load(img.get(position)).into(imageView);
        position_tv.setText(position.toString());
    }

    @OnClick(R.id.next_btn) public void nextImage() {
        if(position == img.size() -1)
            position = 0;
        else
            position = position + 1;

        position_tv.setText(position.toString());
        Glide.with(this).load(img.get(position)).into(imageView);
    }

    @OnClick(R.id.center_crop) public void centerCrop() {
        Glide.with(this).load(img.get(position)).centerCrop().into(imageView);
    }

    @OnClick(R.id.fit_center) public void fitCenter() {
        Glide.with(this).load(img.get(position)).fitCenter().into(imageView);
    }

}
