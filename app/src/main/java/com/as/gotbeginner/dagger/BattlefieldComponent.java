package com.as.gotbeginner.dagger;

import com.as.gotbeginner.War;
import com.as.gotbeginner.house.Bolton;
import com.as.gotbeginner.house.Stark;
import com.as.gotbeginner.model.Cash;
import com.as.gotbeginner.model.Soilders;

import dagger.Component;
import dagger.Module;

@Component(modules = {Cash.class, Soilders.class})
public interface BattlefieldComponent {
    War getWar();
    int getCash();
    String getSoilders();
}
