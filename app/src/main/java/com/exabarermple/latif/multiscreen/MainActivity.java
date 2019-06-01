package com.exabarermple.latif.multiscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        /** To open a new activity we can create a certain class then we can make a object out of the class we have just created.
         * below example we created a OPenNumbersActivity class */
        OpenNumbersActivity open_number = new OpenNumbersActivity ();

// casting the TextView/////
        TextView familyTextView = (TextView)findViewById ( R.id.text_family );

        familyTextView.setOnClickListener (  open_number );

        // or we have do like this => familyTextView.setOnClickListener (  new OpenNumbersActivity ());

    }


    }


