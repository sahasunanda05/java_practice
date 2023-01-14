package com.transmissions;

public abstract class Transmission {
    protected String modelNo;
    protected int forwardGears;
    protected double firstGearRatio;
    protected double secondGearRatio;
    protected double thirdGearRatio;
    protected double fourthGearRatio;
    protected double fifthGearRatio;
    protected double sixthGearRatio;
    protected double seventhGearRatio;
    protected double eighthGearRatio;

    public Transmission(String modelNo) {
        this.modelNo = modelNo;
    }

    public abstract void showSpecs();
}
