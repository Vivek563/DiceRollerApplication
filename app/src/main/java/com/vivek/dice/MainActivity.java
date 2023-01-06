package com.vivek.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     private    ImageButton imgbtn;
      private Random myrandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbtn = findViewById(R.id.imageButton);

        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myRanNumber = myrandom.nextInt(6)+1;

                switch (myRanNumber){
                    case 1:
                        imgbtn.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        imgbtn.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        imgbtn.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        imgbtn.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        imgbtn.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        imgbtn.setImageResource(R.drawable.dice6);
                        break;
                }

            }
        });
    }


}