package com.example.darkwhite.experiment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FrontActivity extends AppCompatActivity {

    private static int sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        TextView itA = (TextView) findViewById(R.id.it_a);
        itA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                sec = 0;
                startActivity(intent);
            }
        });

        TextView itB = (TextView) findViewById(R.id.it_b);
        itB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FrontActivity.this, MainActivity.class);
                sec = 1;
                startActivity(intent);
            }
        });

    }

    public static int getSec() {
        return sec;
    }
}
