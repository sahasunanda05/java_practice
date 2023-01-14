package com.transmissions;

public class AutomaticDCT extends Transmission{
    public AutomaticDCT(String modelNo) {
        super(modelNo);
        switch (modelNo){
            case "DCT8":
                forwardGears=8;
                firstGearRatio=4.714;
                secondGearRatio=3.143;
                thirdGearRatio=2.106;
                fourthGearRatio=1.667;
                fifthGearRatio=1.285;
                sixthGearRatio=1.000;
                seventhGearRatio=0.839;
                eighthGearRatio=0.667;
                break;
        }
    }

    @Override
    public void showSpecs() {
        String specs = "Transmission Type:  Automatic DCT\n" +
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
        if (seventhGearRatio>0)
            specs+= "\n8. 7th Gear Ratio=" + sixthGearRatio;
        if (eighthGearRatio>0)
            specs+= "\n9. 8th Gear Ratio=" + sixthGearRatio;
        System.out.println(specs);
    }
}
