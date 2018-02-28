package com.support.android.ukenya;

/**
 * Created by Nyeri Baptist on 2/2/2018.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * luo translation for the word
     */
    private String mLuoTranslation;

    /** image id resource to for the word*/
    /**
     * kiuk translation for the word
     */
    private String mKiukTranslation;
    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param mLuoTranslation    is the word in the Luo language
     * @param mKiukTransalation  is the word in kikuyu
     */

    public Word(String defaultTranslation, String mLuoTranslation, String mKiukTransalation) {
        mDefaultTranslation = defaultTranslation;
        this.mLuoTranslation = mLuoTranslation;
        this.mKiukTranslation = mKiukTransalation;


    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param mLuoTranslation    is the word in the Miwok language
     * @param mKiukTranslation   is the word in kiuk
     * @param imageResourceId    is the drawable resource ID for the image associated with the word
     */
    public Word(String defaultTranslation, String mLuoTranslation, String mKiukTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        this.mLuoTranslation = mLuoTranslation;
        this.mKiukTranslation = mKiukTranslation;
        mImageResourceId = imageResourceId;

    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the luo translation of the word.
     */
    public String getmLuoTranslation() {
        return mLuoTranslation;
    }

    /**
     * get the kiuk word
     */

    public String getmKiukTranslation() {
        return mKiukTranslation;
    }

    /**
     * get the image id resource
     */

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * returns whether or not thers is an image
     */

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
