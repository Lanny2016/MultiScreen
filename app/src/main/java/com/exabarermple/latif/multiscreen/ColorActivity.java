package com.exabarermple.latif.multiscreen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    // applied the code from numbers activity to display almost the same list
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

        Word w = new Word ( "Black","Sıyah",R.drawable.black,R.raw.siyah);// audio siyah added
        // add it in the words list
        words.add ( w );
        // or
        words.add ( new Word ( "Red","Kırmızı",R.drawable.red,R.raw.kirmizi));
        words.add ( new Word ( "Yellow","Sarı",R.drawable.yellow,R.raw.sari));
        words.add ( new Word ( "Green","Yeşil",R.drawable.green,R.raw.yesil));
        words.add ( new Word ( "Orange","Turuncu",R.drawable.orange,R.raw.turuncu ));
        words.add ( new Word ( "Blue","Mavi",R.drawable.blue,R.raw.mavi));


        /** displaying values on a listView by using a ArrayAdapter
         * below we made an ArrayAdapter which uses <String> in it*/

        // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<> ( this,android.R.layout.simple_list_item_1,words );
        /** To display more value on a listView we can make a custom layout and make a custom class that can contain more
         * objects in then we we will use in ArrayAdapter because ArrayAdapter can only have one dataType at a time*/

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String> ( this,android.R.layout.simple_expandable_list_item_1,words );
        // we update the ArrayAdapter
        //  ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word> ( this,R.layout.custom_list_view,words );
        // now we use custom wordAdapter we made
        wordAdapter adapter = new wordAdapter (this,words,R.color.colorForColorsActivity);
        // casting listView

        ListView list_view = (ListView)findViewById ( R.id.listView );
        list_view.setAdapter ( adapter );

        // adding onItemClickListener for the list to play the audio
        list_view.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Word word = words.get ( position );
               mediaPlayer = MediaPlayer.create ( ColorActivity.this,word.getmAudioResourceId ());
               mediaPlayer.start ();
            }
        } );

    }
}
