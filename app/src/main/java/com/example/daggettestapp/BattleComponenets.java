package com.example.daggettestapp;

import android.content.Context;

import dagger.Component;

@Component
public interface BattleComponenets {

    War getWar();
    //Starks getStarks();
    //Boltons getBoltons();
    void abc(MainActivity mainActivity);
}
