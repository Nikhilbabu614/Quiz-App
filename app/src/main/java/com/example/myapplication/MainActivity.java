package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String [] questions = {"1. In an instance method or a constructor, \"this\" is a reference to the current object.",
            "2. Garbage Collection is manual process.",
            "3. Constructor overloading is not possible in Java"
    };
    private Boolean [] answers = {Boolean.TRUE,Boolean.FALSE,Boolean.FALSE};
    private int score =0;
    private int index = 0;
    Button yes;
    Button no;
    Button playagain;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.button);
        no = findViewById(R.id.button2);
        text = findViewById(R.id.ques);
        text.setText(questions[index]);
        playagain = findViewById(R.id.button4);


            yes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(index <= questions.length-1)
                    {
                        if(answers[index] == Boolean.TRUE){
                            score+=1;
                        }
                        index++;
                        if(index <= questions.length-1){
                            text.setText(questions[index]);
                        }else{
                            Toast.makeText(MainActivity.this, "Your Score :"+score, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

            no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(index <= questions.length-1){
                        if(answers[index] == Boolean.FALSE){
                            score+=1;
                        }
                        index++;
                        if(index <= questions.length-1){
                            text.setText(questions[index]);
                        }else{
                            Toast.makeText(MainActivity.this, "Your Score :"+score, Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });

            playagain.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    index=0;
                    score =0;
                    text.setText(questions[index]);
                }
            });



    }


}