package com.exabarermple.latif.multiscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView number,family,color,phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        /** make array in java
         * we can make different types arrays according to our needs so data types can be different
         * such as  int[] numbers = new int[x]
         * String[] words = new String[x]
         * boolean[] select = new boolean[x]
         * [x] in here is the length of the array*/
        String[] words = new String[10];

        // add value to the array
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";
        //Logging to see if the values in the array works or not
      /** there are different numbers of Logs in android such as
       * Log.v (String, String) => verbose Log
       * Log.i (String, String) => information Log
       * Log.d (String, String) => debug Log
       * Log.w (String, String) => warning Log
       * Log.e (String, String) => error  Log*/
      // below we use the verbose log
        Log.v ("Array values ////// ","value of index 0: " + words[0]);
        Log.v ("Array values ///// ","value of index 1: " + words[1]);
        Log.v ("Array values ///// ","value of index 2: " + words[2]);
        Log.v ("Array values ///// ","value of index 3: " + words[3]);
        Log.v ("Array values ///// ","value of index 4: " + words[4]);
        Log.v ("Array values ///// ","value of index 5: " + words[5]);
        Log.v ("Array values ///// ","value of index 6: " + words[6]);
        Log.v ("Array values ///// ","value of index 7: " + words[7]);
        Log.v ("Array values ///// ","value of index 8: " + words[8]);
        Log.v ("Array values ///// ","value of index 9: " + words[9]);


// casting the TextView for onClick listener
//        number=(TextView)findViewById ( R.id.text_numbers );
//        family=(TextView)findViewById ( R.id.text_family );
//        color=(TextView)findViewById ( R.id.text_color );
//        phrase=(TextView)findViewById ( R.id.text_phrase );
//
//        number.setOnClickListener ( new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//                Intent number_intent = new Intent ( MainActivity.this,NumbersActivity.class );
//                startActivity ( number_intent );
//            }
//        } );
//        family.setOnClickListener ( new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//                Intent family_intent = new Intent ( MainActivity.this,FamilyActivity.class );
//                startActivity ( family_intent );
//
//            }
//        } );
//        color.setOnClickListener ( new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//                Intent color_intent = new Intent ( MainActivity.this,ColorActivity.class );
//                startActivity ( color_intent );
//            }
//        } );
//
//        phrase.setOnClickListener ( new View.OnClickListener () {
//            @Override
//            public void onClick(View v) {
//                Intent phrase_intent = new Intent ( MainActivity.this,PhrasesActivity.class );
//                startActivity ( phrase_intent );
//            }
//        } );



    }


    }


