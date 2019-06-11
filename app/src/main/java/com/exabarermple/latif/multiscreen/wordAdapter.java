package com.exabarermple.latif.multiscreen;

import android.app.Activity;
import android.content.Context;
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

    public wordAdapter(Context context,  ArrayList<Word> words) {
        super ( context, 0, words );
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
        numImage.setImageResource ( currentWord.getImageForNumbers () );
        return listItemView;
    }
}
