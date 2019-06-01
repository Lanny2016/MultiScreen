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

    }
    /** to open a new activity we can use the onClick future of xml file
     we add   android:onClick="xxxxx"  on the xml part  then we call it by creating xxxxx method
     below we add android:onClick="number"  on the xml part  then we call it by creating number method  */
    public void number(View view){
        Intent numberIntent = new Intent ( MainActivity.this,NumbersActivity.class );
        startActivity ( numberIntent );


    }

}
