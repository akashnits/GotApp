package com.as.gotbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.as.gotbeginner.dagger.DaggerBattlefieldComponent;
import com.as.gotbeginner.house.Bolton;
import com.as.gotbeginner.house.Stark;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* //manual DI
        Stark stark= new Stark();
        Bolton bolton= new Bolton();*/


       //Removed manual DI and used dagger to inject War object

        War war= DaggerBattlefieldComponent.create().getWar();
        war.prepare();
        war.fight();

    }
}
