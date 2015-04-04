package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.text.format.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Dylan on 2/28/2015.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public CharSequence getDate() {
        CharSequence formattedDate = DateFormat.format("EEEE, MMM dd yyyy", mDate);
        return formattedDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public String toString() {
        return mTitle;
    }

}
