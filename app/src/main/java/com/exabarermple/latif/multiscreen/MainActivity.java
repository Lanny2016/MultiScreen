package com.exabarermple.latif.multiscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView number,family,color,phrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

//casting the TextView for onClick listener
        number=(TextView)findViewById ( R.id.text_numbers );
        family=(TextView)findViewById ( R.id.text_family );
        color=(TextView)findViewById ( R.id.text_color );
        phrase=(TextView)findViewById ( R.id.text_phrase );

        number.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent number_intent = new Intent ( MainActivity.this,NumbersActivity.class );
                startActivity ( number_intent );
            }
        } );
        family.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent family_intent = new Intent ( MainActivity.this,FamilyActivity.class );
                startActivity ( family_intent );

            }
        } );
        color.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent color_intent = new Intent ( MainActivity.this,ColorActivity.class );
                startActivity ( color_intent );
            }
        } );

        phrase.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent phrase_intent = new Intent ( MainActivity.this,PhrasesActivity.class );
                startActivity ( phrase_intent );
            }
        } );


    }


    }


