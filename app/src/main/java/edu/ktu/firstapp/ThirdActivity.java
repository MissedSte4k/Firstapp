package edu.ktu.firstapp;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;


public class ThirdActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private TextView textView2;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.thirdactivitydesign);


            imageView = (ImageView) findViewById(R.id.imageView);
            textView = (TextView) findViewById(R.id.editText3);
            textView2 = (TextView) findViewById(R.id.editText4);

            textView.setText("Roll Safe");
            textView2.setText("Roll Safe is an image macro serious featuring a screenshot of actor Kayode Ewumi grinning and pointing to his temple while portraying the character Reece Simpson (a.k.a. Roll Safe) in the web series Hood Documentary. The images are often captioned with various jokes mocking poor decision making and failures in critical thinking.");
        }
    }

