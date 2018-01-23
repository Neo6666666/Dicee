package com.adroidz.neo.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRoll = (Button) findViewById(R.id.btnRoll);
        final ImageView leftDice = findViewById(R.id.diceLeft);
        final ImageView rightDice = findViewById(R.id.diceRight);

        final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4,
                R.drawable.dice5, R.drawable.dice6};

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int randomNum = randomNumberGenerator.nextInt(6);
                leftDice.setImageResource(diceArray[randomNum]);
                randomNum = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[randomNum]);
            }
        });
    }

}
