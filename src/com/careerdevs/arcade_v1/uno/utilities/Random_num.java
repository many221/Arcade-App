package com.careerdevs.arcade_v1.uno.utilities;

public abstract class Random_num {

    public static int num(int min, int max){

        int value = (int) Math.floor(Math.random()*(max-min+1)+min);

        return value;

    }


}
