package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {

        int count = 1;
        for (int i = 1; i<=power; i++){
            count*=numberToPrint;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
