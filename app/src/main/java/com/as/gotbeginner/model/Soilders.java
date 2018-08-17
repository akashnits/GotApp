package com.as.gotbeginner.model;

import dagger.Module;
import dagger.Provides;

@Module
public class Soilders {
    public Soilders() {
    }

    @Provides
    public String getSoilders(){
        return "2334";
    }
}
