package com.ahammedejaz.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
    public void bsingle(View view){
        Intent intent=new Intent(this,Autoplay.class);
        startActivity(intent);
    }
    public void bdouble(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
