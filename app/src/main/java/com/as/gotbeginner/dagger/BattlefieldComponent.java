package com.as.gotbeginner.dagger;

import com.as.gotbeginner.War;

import dagger.Component;

@Component
public interface BattlefieldComponent {
    War getWar();
}
