package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Student> studentArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Student student1 = new Student("يوسف" , 14 , 9 , R.drawable.boy);
        Student student2 = new Student("سلمان" , 15 , 10 ,R.drawable.boy1);
        Student student3 = new Student ("ماجد",16 , 11 , R.drawable.boy2);

     studentArrayList.add(student1);
     studentArrayList.add(student2);
     studentArrayList.add(student3);

    }
}