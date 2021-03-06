package com.as.gotbeginner.house;

import android.widget.Toast;

import com.as.gotbeginner.GotApp;
import com.as.gotbeginner.House;

public class Mormont implements House{

    public Mormont() {
    }

    public static final String name= Mormont.class.getSimpleName();

    @Override
    public void prepareForWar() {
        Toast.makeText(GotApp.getAppContext(), name + " Preparing for war", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void reportForWar() {
        Toast.makeText(GotApp.getAppContext(), name + " Reporting to war", Toast.LENGTH_SHORT).show();
    }
}
