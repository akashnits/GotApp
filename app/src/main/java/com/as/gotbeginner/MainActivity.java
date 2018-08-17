package com.as.gotbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.as.gotbeginner.dagger.BattlefieldComponent;
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
        BattlefieldComponent battlefieldComponent= DaggerBattlefieldComponent.create();
        War war= battlefieldComponent.getWar();
        war.prepare();
        war.fight();

        //number of soldiers fighting the war
        Toast.makeText(GotApp.getAppContext(), "Soilders fighting: "
                + battlefieldComponent.getSoilders(), Toast.LENGTH_SHORT).show();
        //cash spent on war
        Toast.makeText(GotApp.getAppContext(), "Cash incurred: "
                + battlefieldComponent.getCash(), Toast.LENGTH_SHORT).show();
    }
}
