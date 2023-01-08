package com.careerdevs.components;

public class Dice {

    private byte value;

    public byte roll() {

        byte min = 1;

        byte max = 6;

        value = (byte)Math.floor(Math.random()*(max-min+1)+min);

        return value;
    }

    public byte getValue() {
        if(value == 0) roll ();
        return value;
    }

    public static void main(String[] args) {
        //Dice will now roll automatically if getValue() is called before roll()
        Dice d1 = new Dice ();
        d1.getValue ();
        System.out.println (d1.getValue ());
        System.out.println (d1.getValue ());
        d1.roll ();
        System.out.println (d1.getValue ());
        System.out.println (d1.getValue ());
    }
}
