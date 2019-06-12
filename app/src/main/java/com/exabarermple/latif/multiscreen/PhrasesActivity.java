package com.exabarermple.latif.multiscreen;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
   private  MediaPlayer mediaPlayer;
    /** below we set the mediaPlayer.setOnCompletionListener as a global object here so that we would not need to create
     * it every time we need it */
    private MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener () {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer ();
        }
    };
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

        Word w = new Word ( "Hi","Merhaba",R.raw.hi);
        // add it in the words list
        words.add ( w );
        // or
        words.add ( new Word ( "How are you?","Nasılsın?",R.raw.howareyou));
        words.add ( new Word ( "How old are you?","Kaç yaşındasın?",R.raw.kacyasindasin));
        words.add ( new Word ( "Where are you from?","Nerelisin?",R.raw.from));
        words.add ( new Word ( "What is your name?","Adın ne?" ,R.raw.name));
        words.add ( new Word ( "Are you married?","Evli misin?",R.raw.married));
        words.add ( new Word ( "How many people do you have?","Ailende kaç kişivar?",R.raw.kackisi));
        words.add ( new Word ( "Do you have any children?","Çocuğun var mı?",R.raw.child));
        words.add ( new Word ( "What are their names?","Onların adları ne?",R.raw.theirnames));

        /** displaying values on a listView by using a ArrayAdapter
         * below we made an ArrayAdapter which uses <String> in it*/

        // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<> ( this,android.R.layout.simple_list_item_1,words );
        /** To display more value on a listView we can make a custom layout and make a custom class that can contain more
         * objects in then we we will use in ArrayAdapter because ArrayAdapter can only have one dataType at a time*/

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String> ( this,android.R.layout.simple_expandable_list_item_1,words );
        // we update the ArrayAdapter
        //  ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word> ( this,R.layout.custom_list_view,words );
        // now we use custom wordAdapter we made
        wordAdapter adapter = new wordAdapter (this,words,R.color.colorForPhrasesActivity);
        // casting listView

        ListView list_view = (ListView)findViewById ( R.id.listView );
        list_view.setAdapter ( adapter );
        /**  now we are setting the itemOnclick listener for the list but it can only play single audio file*/
        list_view.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // creating a mediaPlayer
                Word word = words.get ( position );
                // this is only for single audio ==> mediaPlayer = MediaPlayer.create ( NumbersActivity.this,R.raw.one );
                // release the mediaPlayer in case it plays something before playing the coming one
                releaseMediaPlayer ();
                mediaPlayer = MediaPlayer.create ( PhrasesActivity.this,word.getmAudioResourceId ());
                mediaPlayer.start ();
                // set up a listener on the mediaPlayer so that we can stop and release the mediaPlayer
                //once it it is finished
                mediaPlayer.setOnCompletionListener ( onCompletionListener );
            }
        } );
    }

    @Override
    protected void onStop() {
        super.onStop ();
        // when the activity is stopped, release the mediaPlayer
        // because we wont be playing the sound any more
        releaseMediaPlayer ();
    }

    /** clean up the media player by releasing its resources
         * so we should create a method to do so*/
        private void releaseMediaPlayer(){

            if(mediaPlayer!=null){
                mediaPlayer.release ();
                // set the mediaPlayer to null so that the mediaPlayer cant play an audio file at the moment
                mediaPlayer = null;
            }

        }

    }

