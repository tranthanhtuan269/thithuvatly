package com.choso.tuantt.thithuvatly;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1Btn, answer2Btn, answer3Btn, answer4Btn;
    TextView scoreLbl, questionLbl;

    private Questions mQuestions = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1Btn = (Button) findViewById(R.id.answer1Btn);
        answer2Btn = (Button) findViewById(R.id.answer2Btn);
        answer3Btn = (Button) findViewById(R.id.answer3Btn);
        answer4Btn = (Button) findViewById(R.id.answer4Btn);

        scoreLbl = (TextView) findViewById(R.id.scoreLbl);
        questionLbl = (TextView) findViewById(R.id.questionLbl);

        updateQuestion(r.nextInt(mQuestionsLength));

        answer1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1Btn.getText() == mAnswer){
                    mScore++;
                    scoreLbl.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else{
                    gameOver();
                }
            }
        });

        answer2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2Btn.getText() == mAnswer){
                    mScore++;
                    scoreLbl.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else{
                    gameOver();
                }
            }
        });

        answer3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3Btn.getText() == mAnswer){
                    mScore++;
                    scoreLbl.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else{
                    gameOver();
                }
            }
        });

        answer4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4Btn.getText() == mAnswer){
                    mScore++;
                    scoreLbl.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                }else{
                    gameOver();
                }
            }
        });
    }

    private void gameOver() {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
        alertBuilder.setMessage("Gameover! Your score is " + mScore + " points.")
                .setCancelable(false)
                .setPositiveButton("New game", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.show();
    }

    private void updateQuestion(int num){
        questionLbl.setText(mQuestions.getQuestion(num));
        answer1Btn.setText(mQuestions.getChoice1(num));
        answer2Btn.setText(mQuestions.getChoice2(num));
        answer3Btn.setText(mQuestions.getChoice3(num));
        answer4Btn.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }
}
