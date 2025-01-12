package lk.javainstitute.moviesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import model.User;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


//login button
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation btnAnimation = AnimationUtils.loadAnimation(LoginActivity.this,R.anim.button_animation);
                button2.startAnimation(btnAnimation);


                EditText editText1 = findViewById(R.id.editTextUsername);
                EditText editText2 = findViewById(R.id.editTextPassword);

                String username = editText1.getText().toString();
                String password = editText2.getText().toString();

                if(username.isEmpty()){

                } else if(password.isEmpty()) {

                }else{


                    Intent i = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(i);


                }




            }
        });



//go to signUp
        TextView gotoSignUp = findViewById(R.id.textView4);
        gotoSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(i);
            }
        });



    }
}