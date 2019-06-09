package com.exabarermple.latif.multiscreen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_numbers );

       
        /** make an Arraylist in java
         * we can make different types ArrayLists according to our needs so data types can be different
         * such as  ArrayList<String> xxxxxx = new ArrayList<String>();
         * ArrayList<Integer> xxxxxx = new ArrayList<Integer>()*/

        ArrayList<String> words = new ArrayList<String> ();

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

        /** displaying values on a listView by using a ArrayAdapter
         * below we made an ArrayAdapter which uses <String> in it*/

       ArrayAdapter<String> itemsAdapter = new ArrayAdapter<> ( this,android.R.layout.simple_list_item_1,words );

        // casting listView

        ListView list_view = (ListView)findViewById ( R.id.listView );
       list_view.setAdapter ( itemsAdapter );

    }
}
