package com.transmissions;

public class Manual extends Transmission{
    public Manual(String modelNo) {
        super(modelNo);
        switch (modelNo){
            case "MP4":
                forwardGears=4;
                firstGearRatio=2.540;
                secondGearRatio=1.920;
                thirdGearRatio=1.510;
                fourthGearRatio=1.000;
                break;
            case "MP5":
                forwardGears=5;
                firstGearRatio=3.545;
                secondGearRatio=1.904;
                thirdGearRatio=1.280;
                fourthGearRatio=0.914;
                fifthGearRatio=0.757;
                break;
            case "MP6":
                forwardGears=6;
                firstGearRatio=3.010;
                secondGearRatio=2.070;
                thirdGearRatio=1.430;
                fourthGearRatio=1.000;
                fifthGearRatio=0.710;
                sixthGearRatio=0.570;
                break;
            case "MD5":
                forwardGears=5;
                firstGearRatio=3.545;
                secondGearRatio=1.904;
                thirdGearRatio=1.233;
                fourthGearRatio=0.911;
                fifthGearRatio=0.725;
                break;
            case "MD6":
                forwardGears=6;
                firstGearRatio=3.640;
                secondGearRatio=2.150;
                thirdGearRatio=1.360;
                fourthGearRatio=1.000;
                fifthGearRatio=0.750;
                sixthGearRatio=0.630;
                break;

        }
    }

    @Override
    public void showSpecs() {
        String specs = "Transmission Type:  Manual\n" +
                "Transmission Model Number:  " + modelNo + '\n' +
                "Key Specifications:\n"+
                "1. Forward Gears: " + forwardGears +
                "\n2. 1st Gear Ratio: " + firstGearRatio +
                "\n3. 2nd Gear Ratio: " + secondGearRatio +
                "\n4. 3rd Gear Ratio: " + thirdGearRatio +
                "\n5. 4th Gear Ratio: " + fourthGearRatio;
        if (fifthGearRatio>0)
            specs+= "\n6. 5th Gear Ratio=" + fifthGearRatio;
        if (sixthGearRatio>0)
            specs+= "\n7. 6th Gear Ratio=" + sixthGearRatio;
        System.out.println(specs);
    }
}
