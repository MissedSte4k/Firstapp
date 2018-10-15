package edu.ktu.firstapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageView.ScaleType;

public class FourthActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourthdesign);
        Intent i = getIntent();


        imageView = (ImageView) findViewById(R.id.imageView);
        int k = i.getIntExtra("flag", 0);
        ListItem m = SecondActivity.getById(k);

        imageView.setImageResource(m.getImageId());
    }
}
