public class DieselEngine extends Engine{
    public DieselEngine(String modelNo, float displacement, int maxPower, int maxRpm, int numberOfCylinders) {
        super(modelNo, displacement, maxPower, maxRpm, numberOfCylinders);
    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "modelNo='" + modelNo + '\'' +
                ", displacement=" + displacement +
                ", maxPower=" + maxPower +
                ", maxRpm=" + maxRpm +
                ", numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
