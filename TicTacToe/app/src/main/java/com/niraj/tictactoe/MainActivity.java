package com.niraj.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   int myActive = 0;//0 for cross
    int [] mygameState={2,2,2,2,2,2,2,2,2};
    public void myTapped(View view){

        ImageView img = (ImageView) view;
        int tappedTag = Integer.parseInt(img.getTag().toString());
        if(mygameState[tappedTag]==2) {
            if (myActive == 0) {

                img.setImageResource(R.drawable.cross);
                img.animate().rotation(360).setDuration(1000);
                myActive = 1;

            } else {
                img.setImageResource(R.drawable.circle);
                myActive = 0;
            }
            mygameState[tappedTag]=myActive;
        }
        else{
            Toast toast = Toast.makeText( getApplicationContext(),"This Place has Alredy been taken!",Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void playAgain(View view){
       //Log.i("hy","tapped");
        for(int i=0;i<mygameState.length;i++){
            mygameState[i]=2;
        }
        myActive=0;

        LinearLayout linearLayout= (LinearLayout) findViewById(R.id.line1);
        for(int i =0;i<linearLayout.getChildCount();i++){
            ((ImageView)linearLayout.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
        LinearLayout linearLayout1= (LinearLayout) findViewById(R.id.line2);
        for(int i =0;i<linearLayout1.getChildCount();i++){
            ((ImageView)linearLayout1.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
        LinearLayout linearLayout2= (LinearLayout) findViewById(R.id.line3);
        for(int i =0;i<linearLayout2.getChildCount();i++){
            ((ImageView)linearLayout2.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
