package com.bignerdranch.android.criminalintent;

import android.content.Context;

/**
 * Created by Dylan on 3/21/2015.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private CrimeLab(Context appContext) {
        mAppContext = appContext;
    }

    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }
}
