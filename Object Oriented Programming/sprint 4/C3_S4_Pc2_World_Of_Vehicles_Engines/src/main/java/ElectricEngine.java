public class ElectricEngine extends Engine{
    int voltage;

    public ElectricEngine(String modelNo, float displacement, int maxPower, int maxRpm, int numberOfCylinders, int voltage) {
        super(modelNo, displacement, maxPower, maxRpm, numberOfCylinders);
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "ElectricEngine{" +
                "modelNo='" + modelNo + '\'' +
                ", displacement=" + displacement +
                ", maxPower=" + maxPower +
                ", maxRpm=" + maxRpm +
                ", numberOfCylinders=" + numberOfCylinders +
                ", Voltage=" + voltage +
                '}';
    }
}
