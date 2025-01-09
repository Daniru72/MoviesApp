package lk.javainstitute.moviesapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ConstrainLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ImageView logoImageView = findViewById(R.id.imageView2);

        SpringAnimation springAnimation = new SpringAnimation(logoImageView, DynamicAnimation.TRANSLATION_Y);
        SpringForce springForce  = new SpringForce();
        springForce.setStiffness(SpringForce.STIFFNESS_LOW);
        springForce.setDampingRatio(SpringForce.DAMPING_RATIO_LOW_BOUNCY);
        springForce.setFinalPosition(200f);

        springAnimation.setSpring(springForce);
        springAnimation.start();

        ImageView logoImageView2 = findViewById(R.id.shapeableImageView);

        SpringAnimation springAnimation2 = new SpringAnimation(logoImageView2, DynamicAnimation.TRANSLATION_Y);
        SpringForce springForce2  = new SpringForce();
        springForce2.setStiffness(SpringForce.STIFFNESS_LOW);
        springForce2.setDampingRatio(SpringForce.DAMPING_RATIO_LOW_BOUNCY);
        springForce2.setFinalPosition(200f);

        springAnimation2.setSpring(springForce2);
        springAnimation2.start();

        TextView logotext = findViewById(R.id.textView6);

        SpringAnimation springAnimation3 = new SpringAnimation(logotext, DynamicAnimation.TRANSLATION_Y);
        SpringForce springForce3  = new SpringForce();
        springForce3.setStiffness(SpringForce.STIFFNESS_LOW);
        springForce3.setDampingRatio(SpringForce.DAMPING_RATIO_LOW_BOUNCY);
        springForce3.setFinalPosition(280f);

        springAnimation3.setSpring(springForce3);
        springAnimation3.start();

         //animate cycle
        Animation animation = AnimationUtils.loadAnimation(IntroActivity.this,R.anim.intro_animation);
        logoImageView.startAnimation(animation);



     //button click
        Button getStartBtn = findViewById(R.id.button);
        getStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroActivity.this,LoginActivity.class);
                startActivity(i);
                finish();
            }
        });


        //auto move to MainActivity
        new Handler().postDelayed(()->{

            Intent i = new Intent(IntroActivity.this,LoginActivity.class);
            startActivity(i);
            finish();

        },3000);


    }
}