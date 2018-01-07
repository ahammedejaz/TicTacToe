package com.ahammedejaz.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Autoplay extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Bclick(View view) {
        //Getting the button which user has clicked
        Button bselect=(Button)view;
        int bcell=0;
        //For getting the unique Button ID
        switch (bselect.getId()){
            case R.id.bu1:
                bcell=1;
                break;
            case R.id.bu2:
                bcell=2;
                break;
            case R.id.bu3:
                bcell=3;
                break;
            case R.id.bu4:
                bcell=4;
                break;
            case R.id.bu5:
                bcell=5;
                break;
            case R.id.bu6:
                bcell=6;
                break;
            case R.id.bu7:
                bcell=7;
                break;
            case R.id.bu8:
                bcell=8;
                break;
            case R.id.bu9:
                bcell=9;
                break;
        }
        PlayGame(bcell,bselect); //Declaring PlayGame Method
    }
    int Activep=1;
    ArrayList<Integer>Player1=new ArrayList<Integer>();     //Storing Player 1 Data
    ArrayList<Integer>Player2=new ArrayList<Integer>();         //Storing Player 2 Data
    void PlayGame(int bcell,Button bselect ) {   //Passing Cell number and the Which Button is clicked
        if (Activep == 1) {
            bselect.setText("P1");  //Displaying the Player
            bselect.setBackgroundColor(Color.GREEN); //Giving Colour to the player cell
            Player1.add(bcell); //Adding the cell data into the player 1 Array List
            AutoPlay();
            Activep = 2; //Activating Player 2
        } else if (Activep == 2) {
            bselect.setText("P2");  //Displaying the Player
            bselect.setBackgroundColor(Color.CYAN); //Giving Colour to the player cell
            Player2.add(bcell); //Adding the cell data into the player 2 Array List
            Activep = 1; //Activating player 1
        }
        bselect.setEnabled(false);
        Winner(); //After selecting the cells we are calling Winner() Function
    }

    //For Declaring the Winner
    void Winner(){
        int win=-1;
        //For ROW 1 therefore here we are checking the bcell numbers 1,2,3
        if(Player1.contains(1)&&Player1.contains(2)&&Player1.contains(3)){
            win=1;
        }
        if(Player2.contains(1)&&Player2.contains(2)&&Player2.contains(3)){
            win=2;
        }
        //For ROW 2 therefore here we are checking the bcell numbers 4,5,6
        if(Player1.contains(4)&&Player1.contains(5)&&Player1.contains(6)){
            win=1;
        }
        if(Player2.contains(4)&&Player2.contains(5)&&Player2.contains(6)){
            win=2;
        }
        //For ROW 3 therefore here we are checking with the bcell numbers 7,8,9
        if(Player1.contains(7)&&Player1.contains(8)&&Player1.contains(9)){
            win=1;
        }
        if(Player2.contains(7)&&Player2.contains(8)&&Player2.contains(9)){
            win=2;
        }

        //For COLOUMN 1 therefore here we are checking with the bcell numbers 1,4,7
        if(Player1.contains(1)&&Player1.contains(4)&&Player1.contains(7)){
            win=1;
        }
        if(Player2.contains(1)&&Player2.contains(4)&&Player2.contains(7)){
            win=2;
        }
        //For COLOUMN 2 therefore here we are checking with the bcell numbers 2,5,8
        if(Player1.contains(2)&&Player1.contains(5)&&Player1.contains(8)){
            win=1;
        }
        if(Player2.contains(2)&&Player2.contains(5)&&Player2.contains(8)){
            win=2;
        }
        //For COLOUMN 3 therefore here we are checking with the bcell numbers 3,6,9
        if(Player1.contains(3)&&Player1.contains(6)&&Player1.contains(9)){
            win=1;
        }
        if(Player2.contains(3)&&Player2.contains(6)&&Player2.contains(9)){
            win=2;
        }

        //Therefore we have a Winner here
        if(win!=-1){
            if(win==1){
                Toast.makeText(this,"Congratulations Player 1 Won the Game",Toast.LENGTH_LONG).show();
            }
            if(win==2){
                Toast.makeText(this,"Congratulations Player 2 Won the Game",Toast.LENGTH_LONG).show();
            }
        }
    }
    void AutoPlay(){
        ArrayList<Integer>Emptycells=new ArrayList<Integer>();

        for(int cell=0;cell<10;cell++){
            if (!( Player1.contains(cell) || Player2.contains(cell))){
                Emptycells.add(cell);

            }
        }
        Random r=new Random();
        int RandIndex=r.nextInt(Emptycells.size()-0)+0;
        int cell=Emptycells.get(RandIndex);

        Button bbselect;
        switch (cell){
            case 1:
                bbselect=(Button)findViewById(R.id.bu1);
                break;
            case 2:
                bbselect=(Button)findViewById(R.id.bu2);
                break;
            case 3:
                bbselect=(Button)findViewById(R.id.bu3);
                break;
            case 4:
                bbselect=(Button)findViewById(R.id.bu4);
                break;
            case 5:
                bbselect=(Button)findViewById(R.id.bu5);
                break;
            case 6:
                bbselect=(Button)findViewById(R.id.bu6);
                break;
            case 7:
                bbselect=(Button)findViewById(R.id.bu7);
                break;
            case 8:
                bbselect=(Button)findViewById(R.id.bu8);
                break;
            case 9:
                bbselect=(Button)findViewById(R.id.bu9);
                break;
        }
        //PlayGame(cell, bbselect);




    }

}

