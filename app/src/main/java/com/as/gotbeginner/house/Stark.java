package com.as.gotbeginner.house;

import android.widget.Toast;

import com.as.gotbeginner.GotApp;
import com.as.gotbeginner.House;

import javax.inject.Inject;

public class Stark implements House {

    @Inject
    Stark() {
    }

    public static final String name= Stark.class.getSimpleName();

    @Override
    public void prepareForWar() {
        Toast.makeText(GotApp.getAppContext(), name + " Preparing for war", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void reportForWar() {
        Toast.makeText(GotApp.getAppContext(), name + " Reporting to war", Toast.LENGTH_SHORT).show();
    }
}
