package com.company;

public class Main {

    public static void main(String[] args) {
        //This is an example of State Pattern on Java
        //The clock changes its state
        
        SmartWatch a = new SmartWatch();
        a.showInformation();

        a.setMode(new ModeTimer());
        a.showInformation();

        a.setMode(new ModeChronometer());
        a.showInformation();
    }
}
