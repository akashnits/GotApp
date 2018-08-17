package com.as.gotbeginner.model;

import dagger.Module;
import dagger.Provides;

@Module
public class Cash {
    public Cash() {
    }
    @Provides
    public int getCash(){
        return 18903;
    }
}
