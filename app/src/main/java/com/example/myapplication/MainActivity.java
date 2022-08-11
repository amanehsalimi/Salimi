package com.example.myapplication;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
TextView text1;
TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scanner sc = new Scanner(System.in);
        text1 = findViewById(R.id.textView1);
        text2 = findViewById(R.id.textView2);
        Student stu = new Student();
        stu.setScore(sc);
        String.valueOf(stu.getScore());
        final Runnable runnable = () -> text1.setText( View.SCROLLBARS_OUTSIDE_INSET );
        // makeText(MainActivity.this,String.valueOf( stu.getScore()), LENGTH_SHORT).show();

        stu.getBMI();
        stu.getScore();
    }
}