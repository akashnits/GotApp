package com.as.gotbeginner;

import com.as.gotbeginner.house.Bolton;
import com.as.gotbeginner.house.Stark;

import javax.inject.Inject;

public class War {
    @Inject
    Stark stark;
    @Inject
    Bolton bolton;

    @Inject
    War(Stark stark, Bolton bolton) {
        this.stark = stark;
        this.bolton = bolton;
    }

    public void prepare(){
        stark.prepareForWar();
        bolton.prepareForWar();
    }

    public void fight(){
        stark.reportForWar();
        bolton.reportForWar();
    }
}
