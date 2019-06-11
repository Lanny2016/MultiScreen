package com.exabarermple.latif.multiscreen;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/** to show the values on the list properly we made custom wordAdapter*/
public class wordAdapter extends ArrayAdapter<Word> {

    /** Resource ID for the color of this list of words*/
    private int mColorResourceId;

    public wordAdapter(Context context,  ArrayList<Word> words,int colorResourceId) {
        super ( context, 0, words );
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){

          listItemView = LayoutInflater.from ( getContext ()).inflate ( R.layout.custom_list_view,parent,false);
        }
        Word currentWord = getItem ( position );

        TextView englishTranslation = (TextView)listItemView.findViewById ( R.id.textViewEnglish );
        englishTranslation.setText ( currentWord.getmEnglish ());
        TextView turkishTranslation = (TextView)listItemView.findViewById ( R.id.textViewTurkish );
        turkishTranslation.setText ( currentWord.getmTurkish ());
        ImageView numImage = (ImageView)listItemView.findViewById ( R.id.imageForNumbers );
        // decide that if the listView should have the image or not////////////////////////////////////////////
        if (currentWord.hasImage ()){
            numImage.setImageResource ( currentWord.getImageForNumbers () );
            numImage.setVisibility ( View.VISIBLE );
        }else {
            numImage.setVisibility ( View.GONE );
        }
        // set the theme color for the list item
        View textContainer = listItemView.findViewById ( R.id.text_container);
        // find color that the resource Id maps to
        int Color = ContextCompat.getColor ( getContext (),mColorResourceId );
        //set the background color of the text Container View
        textContainer.setBackgroundColor ( Color );
        return listItemView;
    }
}
