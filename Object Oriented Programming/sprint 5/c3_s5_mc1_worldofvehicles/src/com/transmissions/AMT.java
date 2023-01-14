package com.transmissions;

public class AMT extends Transmission{
    public AMT(String modelNo) {
        super(modelNo);
        switch (modelNo){
            case "AMTP4":
                forwardGears=4;
                firstGearRatio=2.540;
                secondGearRatio=1.920;
                thirdGearRatio=1.510;
                fourthGearRatio=1.000;
                break;
            case "AMTD5":
                forwardGears=5;
                firstGearRatio=2.950;
                secondGearRatio=1.940;
                thirdGearRatio=1.340;
                fourthGearRatio=1.000;
                fifthGearRatio=0.630;
                break;

        }
    }

    @Override
    public void showSpecs() {
        String specs = "Transmission Type:  Automated Manual\n" +
                "Transmission Model Number:  " + modelNo + '\n' +
                "Key Specifications:\n"+
                "1. Forward Gears: " + forwardGears +
                "\n2. 1st Gear Ratio: " + firstGearRatio +
                "\n3. 2nd Gear Ratio: " + secondGearRatio +
                "\n4. 3rd Gear Ratio: " + thirdGearRatio +
                "\n5. 4th Gear Ratio: " + fourthGearRatio;
        if (fifthGearRatio>0)
            specs+= "\n6. 5th Gear Ratio=" + fifthGearRatio;
        System.out.println(specs);
    }
}
