package com.example.oop24112020;

import android.util.Log;
import android.webkit.ConsoleMessage;

public class Animal {
//     1 : Thuộc tính
    private String name;
    private Integer weight;

//    2 : Hành vi

//    constructor : phuong thuc khoi tao
//    mac dinh object se cung cap constructor rong cho lop doi tuong
    public Animal (String name , Integer weight){
        this.name = name;
        this.weight = weight;
    }
    public void setName (String name){
        if (name.length() <= 0){
            Log.d("BBB","THuoc tinh chua co gia tri");}
        }

    void esle{
        this.name = name;
    }
        }
    public String getName () {
        return name
    }
}
