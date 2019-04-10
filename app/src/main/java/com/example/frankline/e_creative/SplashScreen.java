package com.example.frankline.e_creative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    Button sub;
    ImageView ballon;
    Animation frombottom, fromtop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
//        getSupportActionBar().hide();

        sub =(Button) findViewById(R.id.sub);
        ballon = (ImageView) findViewById(R.id.ballon);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        sub.setAnimation(frombottom);
        ballon.setAnimation(fromtop);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(SplashScreen.this,HomeActivity.class);
                startActivity(home);
            }
        });
    }
}
