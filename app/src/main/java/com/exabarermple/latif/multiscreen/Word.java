package com.exabarermple.latif.multiscreen;

/**
 * {@link Word } a custom class we could use it in n ArrayAdapter in order to hold more
 * values in a listView
 * it contains English and Turkish translation*/

public class Word {

    /** mEnglish translation*/
    private String mEnglish;
    /** mTurkish translation*/
    private String mTurkish;
    /** image for numbers*/
    private int imageForNumbers;

    public Word(String mEnglish, String mTurkish, int imageForNumbers) {
        this.mEnglish = mEnglish;
        this.mTurkish = mTurkish;
        this.imageForNumbers = imageForNumbers;
    }

    /** get method for mEnglish translation*/


    public String getmEnglish() {
        return mEnglish;
    }
    /** get method for mTurkish translation*/
    public String getmTurkish() {
        return mTurkish;
    }
    /** get method for imageForNumberstranslation*/
    public int getImageForNumbers() {
        return imageForNumbers;
    }
}
