package com.company;


public interface Time {
    void showInformation();
}

class ModeHour implements Time {

    @Override
    public void showInformation() {
        System.out.println("It's eleven o'clock");
    }

}

class ModeTimer implements Time {

    @Override
    public void showInformation() {
        System.out.println("5 min");
    }
}

class ModeChronometer implements Time {

    @Override
    public void showInformation() {
        System.out.println("0,001");
    }
}


class SmartWatch {
    Time mode;

    public SmartWatch() {
        mode = new ModeHour();
    }

    public void showInformation() {
        mode.showInformation();
    }

    public void setMode(Time mode) {
        this.mode = mode;
    }
}
