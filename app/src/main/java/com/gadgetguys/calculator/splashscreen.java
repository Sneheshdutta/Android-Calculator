package com.gadgetguys.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {

    // declaration
    ImageView img1;
    TextView text1;
    Animation logo,logotext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //disable status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //status bar disabled
        setContentView(R.layout.activity_splashscreen);

        //typecasting
        img1=(ImageView)findViewById(R.id.logo);
        text1=(TextView)findViewById(R.id.logotext);

        logo= AnimationUtils.loadAnimation(getApplication(),R.anim.logo_animation);
        logotext= AnimationUtils.loadAnimation(getApplication(),R.anim.logotext_animation);

        img1.setAnimation(logo);
        text1.setAnimation(logotext);

        //using of handlar
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //starting mainactvity
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                //finishing splash activity, stopping back return
                finish();
            }
        }, 2500);

    }
}
