package com.example.oop24112020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animal dog = new Animal("kiki",5);
        dog.setName("milu");

//        public : ai cung thay
//        private : ai tao thi nguoi do thay
//        default : giong private nhung cac class trong package co the thay gia tri

    }
}