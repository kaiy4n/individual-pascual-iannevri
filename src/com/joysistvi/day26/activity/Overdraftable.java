package com.joysistvi.day26.activity;

public interface Overdraftable {

    double OVERDRAFT_LIMIT = 2000.0;

    boolean isWithinOverdraft(double amount);

}
