package lk.javainstitute.moviesapp;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ConstrainLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ImageView imageView1 = findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation btnAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.button_animation);
                imageView1.startAnimation(btnAnimation);

            }
        });


        //Wishlist
        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation btnAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.button_animation);
                imageView3.startAnimation(btnAnimation);

            }
        });


        //cart
        ImageView imageView5 = findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation btnAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.button_animation);
                imageView5.startAnimation(btnAnimation);

            }
        });


        //profile
        ImageView imageView6 = findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation btnAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.button_animation);
                imageView6.startAnimation(btnAnimation);

            }
        });




    }
}