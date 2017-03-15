package com.example.android.miwok;

/**
 * Created by mikem on 3/14/17.
 */

public class Word {

    private String mDefultTranslation;
    private String mMiwokTranslation;

    public Word(String defultTranslation, String miwokTranslation) {
        mDefultTranslation = defultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefultTranslation() {
        return mDefultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


}
