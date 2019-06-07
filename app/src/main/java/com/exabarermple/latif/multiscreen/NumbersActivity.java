package com.exabarermple.latif.multiscreen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_numbers );

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
        //displaying the listValues in the layout
        LinearLayout rootView = (LinearLayout)findViewById ( R.id.root_view );

        /** displaying listView values on a layout as well as by using while loop and for loop*/

//        int index = 0;
//        TextView wordView1 = new TextView ( this );
//           wordView1.setText ( words.get ( index ) );
//            wordView1.setTextSize ( 16);
//           rootView.addView ( wordView1 );
    //
      //  int index = 0;
//        while (words.size ()<10){
//            TextView wordView1 = new TextView ( this );
//            wordView1.setText ( words.get ( index ) );
//            wordView1.setTextSize ( 16);
//            rootView.addView ( wordView1 );
//// index += 1 ======> index++
//            index++;
//        }
        for(int index = 0;index < words.size(); index++){
            TextView wordView1 = new TextView ( this );
            wordView1.setText ( words.get ( index ) );
            wordView1.setTextSize ( 25 );
            wordView1.setTextColor ( Color.RED );
            wordView1.setAllCaps ( true );
            rootView.addView ( wordView1 );
        }








    }
}
