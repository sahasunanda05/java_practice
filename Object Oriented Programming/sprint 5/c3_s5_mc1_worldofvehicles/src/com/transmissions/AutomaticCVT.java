package com.transmissions;

public class AutomaticCVT extends Transmission{
    public AutomaticCVT(String modelNo) {
        super(modelNo);
        switch (modelNo){
            case "CVT6":
                forwardGears=6;
                firstGearRatio=2.631;
                secondGearRatio=1.440;
                thirdGearRatio=1.165;
                fourthGearRatio=0.906;
                fifthGearRatio=0.680;
                sixthGearRatio=0.499;
                break;
        }
    }

    @Override
    public void showSpecs() {
        String specs = "Transmission Type:  Automatic CVT\n" +
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
