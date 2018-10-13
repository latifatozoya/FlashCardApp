package com.example.latifat.flashcardapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        findViewById(R.id.flashcard_answer).setVisibility(View.VISIBLE);
        findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
    }
}
