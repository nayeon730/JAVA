package com.ohgiraffers.section03.Practice01;

public class RemoteControl {

    private final Lamp lamp = new Lamp();

    public void turnOn() {
        lamp.turnOn();
    }

    public void upBrightness() {
        lamp.upBrightness();
    }

    public void downBrightness() {
        lamp.downBrightness();
    }

    public void changeColor() {
        lamp.changeColor();
    }

    public void turnOff() {
        lamp.turnOff();
    }

}
