package com.yoji.infinitacivityloop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        TextView message = findViewById(R.id.messageTextViewID);
        String messageText = getString(R.string.message, random.nextInt(100) + 1);
        message.setText(messageText);

        intitPreviousButton();
        initNextButton();
    }

    public void intitPreviousButton() {
        Button previousButton = findViewById(R.id.previousButtonID);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void initNextButton() {
        Button nextButton = findViewById(R.id.nextButtonID);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}