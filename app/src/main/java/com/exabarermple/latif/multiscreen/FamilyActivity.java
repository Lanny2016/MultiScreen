package com.exabarermple.latif.multiscreen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.worlist );


        /** make an Arraylist in java
         * we can make different types ArrayLists according to our needs so data types can be different
         * such as  ArrayList<String> xxxxxx = new ArrayList<String>();
         * ArrayList<Integer> xxxxxx = new ArrayList<Integer>()*/

        /** below we use Word class which contains 2 objects such as mEnglish and mTurkish instead of String in the ArrayList
         * ArrayList<String> words = new ArrayList<String>();
         * ArrayList<Word> words = new ArrayList<Word>(); */

        final ArrayList<Word> words = new ArrayList<> ();
        /**we add final before ArrayList<Word> words = new ArrayList<>();
         * so that the variable not to be changed anymore and we can call in the inner class
         * because it is in onCreate method
         * putting final like making it public to call it from inner class
         */
        // adding value to the ArrayList
        //words.add ( "one");

        /** now we create a new word object and add word objects in the list*/

        Word w = new Word ( "Grandfather","Dede",R.drawable.grandfather,R.raw.dede);//audio dede added
        // add it in the words list
        words.add ( w );
        // or
        words.add ( new Word ( "Grandmother","Nene",R.drawable.grandmother,R.raw.nene));
        words.add ( new Word ( "Father","Baba",R.drawable.father,R.raw.baba ));
        words.add ( new Word ( "Mother","Anne",R.drawable.mother,R.raw.anne));
        words.add ( new Word ( "daughter","Kız",R.drawable.daughter,R.raw.kizim ));
        words.add ( new Word ( "Son","Oğul",R.drawable.son,R.raw.ogul));
        words.add ( new Word ( "Brother","Ağabey",R.drawable.brother,R.raw.abey ));
        words.add ( new Word ( "Sister","Abla",R.drawable.sister,R.raw.abla));

        /** displaying values on a listView by using a ArrayAdapter
         * below we made an ArrayAdapter which uses <String> in it*/

        // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<> ( this,android.R.layout.simple_list_item_1,words );
        /** To display more value on a listView we can make a custom layout and make a custom class that can contain more
         * objects in then we we will use in ArrayAdapter because ArrayAdapter can only have one dataType at a time*/

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String> ( this,android.R.layout.simple_expandable_list_item_1,words );
        // we update the ArrayAdapter
        //  ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word> ( this,R.layout.custom_list_view,words );
        // now we use custom wordAdapter we made
        wordAdapter adapter = new wordAdapter (this,words,R.color.colorForFamilyActivity);
        // casting listView

        ListView list_view = (ListView)findViewById ( R.id.listView );
        list_view.setAdapter ( adapter );
        // OnItemClickListener for list to play audio
        list_view.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Word word = words.get ( position );
               mediaPlayer = MediaPlayer.create (FamilyActivity.this,word.getmAudioResourceId ());
               mediaPlayer.start ();
            }
        } );


    }
}
