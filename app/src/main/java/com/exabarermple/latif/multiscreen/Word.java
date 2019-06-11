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
    /** we use  public static final to make constant in java whose value can not be changed any more
     * once it is assigned. because it is constant we declare it with a capital letter
     * below we make int to -1 because that is the only exception in here for other possibility*/
    public static final int NO_IMAGE_PROVIDED = -1;
    /** recourseId for different backgrounds*/
    private int NumbersActivityBackgroundColor;
    private int ColorActivityBackgroundColor;
    private int FamilyActivityBackgroundColor;
    private int PhraseActivityBackgroundColor;

    public Word(String mEnglish, String mTurkish, int imageForNumbers) {
        this.mEnglish = mEnglish;
        this.mTurkish = mTurkish;
        this.imageForNumbers = imageForNumbers;
    }
    /** we need to add two more constructors  because three of the activities need to have images
     * in the listView and different color background
     * and the phrase activity no image in listView*/

    public Word(int NumbersActivityBackgroundColor,int ColorActivityBackgroundColor,int FamilyActivityBackgroundColor,
                int PhraseActivityBackgroundColor){
        this.ColorActivityBackgroundColor = ColorActivityBackgroundColor;
        this.NumbersActivityBackgroundColor = NumbersActivityBackgroundColor;
        this.FamilyActivityBackgroundColor = FamilyActivityBackgroundColor;
        this.PhraseActivityBackgroundColor = PhraseActivityBackgroundColor;
    }

    public Word(String mEnglish,String mTurkish){
        this.mEnglish = mEnglish;
        this.mTurkish = mTurkish;

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

    public int getNumbersActivityBackgroundColor(){return NumbersActivityBackgroundColor;}
    public int getColorActivityBackgroundColor(){return ColorActivityBackgroundColor;}
    public int getFamilyActivityBackgroundColor(){return FamilyActivityBackgroundColor;}
    public int getPhraseActivityBackgroundColor(){return PhraseActivityBackgroundColor;}
}
