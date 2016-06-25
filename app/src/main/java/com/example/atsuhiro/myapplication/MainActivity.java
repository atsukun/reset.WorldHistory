package com.example.atsuhiro.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageQuestion[] imageQuestions;//画像の問題
    int count = 0;
    private TextView question;
    Random random = new Random();
    int number = random.nextInt(4);
    private ImageView Image;
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private TextView status;
    String tu;
    Button choices;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = (TextView)findViewById(R.id.question_text);

        Image = (ImageView)findViewById(R.id.ImageView);

        status = (TextView)findViewById(R.id.status);

        button = (Button)findViewById(R.id.button);

        button2 = (Button)findViewById(R.id.button2);

        button3 = (Button)findViewById(R.id.button3);

        button4 = (Button)findViewById(R.id.button4);

        imageQuestions = ImageQuestion.values();

        showQuestion(imageQuestions[count]);

        makeQuestion(imageQuestions[count]);


    }
    private void showQuestion(ImageQuestion Question) {

        class Question{
            Question q1 = new Question(R.drawable.ic_launcher, "問題１", new String[]{"", "", ""});
            question_list.add(q1);
        }

        Question q1 = new Question(R.mipmap.ic_launcher, "問題１", new String[]{"", "", ""});
        question_list.add(q1);

    }



    // 問題を表示するためのメソッド
    private void makeQuestion(ImageQuestion imageQuestion) {

        status.setText(String.valueOf(current)+""
                        + String.valueOf(current_num)
        );


        currect_question = currect_list.get(current);

        question.setText(currect_question.question_text);
        imageQuestion.setImageResurce(current_question.image_id);

        String[] choices_text = question_question.getChoices();
        button.setText(choices_text[0]);
        button2.setText(choices_text[1]);
        button3.setText(choices_text[2]);
        button4.setText(choices_text[3]);

        current = current + 1;


    }

    public void click(View v){

        String buttonText = ((Button)v).getText().toString();

        if(buttonText.equals(current_question.answer)){
            current_num = current_num + 1;
        }

        nextQuestion();
    }



    private boolean isAnswer(String text) {
        return true;
    }



}
