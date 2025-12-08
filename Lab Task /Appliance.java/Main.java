package oop;

public class Main {

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine("LG");
        Refrigerator rf = new Refrigerator("Samsung");

        wm.powerSwitch("ON");
        wm.operate();

        System.out.println();

        rf.powerSwitch("ON");
        rf.operate();
    }
}
