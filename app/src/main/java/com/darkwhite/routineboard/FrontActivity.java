package com.darkwhite.routineboard;

import android.content.Intent;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.ImageView;
import android.widget.TextView;

import com.darkwhite.routineboard.R;


public class FrontActivity extends AppCompatActivity {
    private ImageView button_more;

    private static int sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        button_more = (ImageView) findViewById(R.id.more);
        button_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmore();

            }
        });


        overridePendingTransition(0,0);
        View relativeLayout=findViewById(R.id.login_container);
        Animation animation= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        relativeLayout.startAnimation(animation);

        ImageView itA = (ImageView) findViewById(R.id.sectiona);
        itA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                sec = 0;
                startActivity(intent);
            }
        });

        ImageView itB = (ImageView) findViewById(R.id.sectionb);
        itB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                sec = 1;
                startActivity(intent);
            }
        });


        ImageView itC = (ImageView) findViewById(R.id.sectionc);
        itC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                sec = 2;
                startActivity(intent);
            }
        });
        TextView darkwhite_icon = (TextView) findViewById(R.id.darkwhite_icon);        //mail link of habib
        darkwhite_icon.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void openmore(){

        Intent intent = new Intent(this, more.class);
        startActivity(intent);


    }

    public static int getSec() {
        return sec;
    }
}
