package com.maburton.restaurantapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button aboutButton;
    private Button menuButton;
    private Button contactButton;
    private ImageView restoImageView;
    private TextView titleTextView;

    public void init() {
        restoImageView = (ImageView)findViewById(R.id.PreviewImageView);
        aboutButton = (Button)findViewById(R.id.sample1Button);
        menuButton = (Button)findViewById(R.id.sample2Button);
        contactButton = (Button)findViewById(R.id.sample3Button);

        restoImageView.setColorFilter(Color.argb(90, 255, 255, 255));

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutLaunch = new Intent(MainActivity.this, AboutOptionActivity.class);
                startActivity(aboutLaunch);
            }
        });

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuLaunch = new Intent(MainActivity.this, MenuOptionActivity.class);
                startActivity(menuLaunch);
            }
        });

        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactLaunch = new Intent(MainActivity.this, ContactOptionActivity.class);
                startActivity(contactLaunch);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
}







