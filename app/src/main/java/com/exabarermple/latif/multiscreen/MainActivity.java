package com.exabarermple.latif.multiscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView number,family,color,phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        // making array and text the value in Logcat
        /** make an Arraylist in java
         * we can make different types ArrayLists according to our needs so data types can be different
         * such as  ArrayList<String> xxxxxx = new ArrayList<String>();
         * ArrayList<Integer> xxxxxx = new ArrayList<Integer>()*/

        ArrayList<String> words = new ArrayList<String> ( );

        // adding value to the ArrayList
       words.add ( "one" );
       words.add ( "two" );
        words.add ( "three" );
        words.add ( "four" );
        words.add ( "five" );
        words.add ( "six" );
        words.add ( "seven" );
        words.add ( "eight" );
        words.add ( "nine" );
        words.add ( "ten" );
        //Logging to see if the values in the array works or not
        /** there are different numbers of Logs in android such as
         * Log.v (String, String) => verbose Log
         * Log.i (String, String) => information Log
         * Log.d (String, String) => debug Log
         * Log.w (String, String) => warning Log
         * Log.e (String, String) => error  Log*/
        // below we use the verbose log
        Log.v ("Array values ////// ","value of index 0: " + words.get ( 0 ));
        Log.v ("Array values ///// ","value of index 1: " + words.get ( 1 ));
        Log.v ("Array values ///// ","value of index 2: " + words.get ( 2 ));
        Log.v ("Array values ///// ","value of index 3: " + words.get ( 3 ));
        Log.v ("Array values ///// ","value of index 4: " + words.get ( 4 ));
        Log.v ("Array values ///// ","value of index 5: " + words.get ( 5 ));
        Log.v ("Array values ///// ","value of index 6: " + words.get ( 6 ));
        Log.v ("Array values ///// ","value of index 7: " + words.get ( 7 ));
        Log.v ("Array values ///// ","value of index 8: " + words.get ( 8 ));
        Log.v ("Array values ///// ","value of index 9: " + words.get ( 9 ));


//casting the TextView for onClick listener
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


