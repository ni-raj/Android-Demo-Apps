package com.niraj.snakes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    int[] myDices={
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six
    };
    public void rolltapper(View view){

        Random ran = new Random();
        int randomeNumber=ran.nextInt(6);
        Log.i("Random","Random Button" + randomeNumber);

        ImageView dice = (ImageView) findViewById(R.id.dice);
        dice.setImageResource(myDices[randomeNumber]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
