public class CompressedNaturalGasEngine extends Engine{

    public CompressedNaturalGasEngine(String modelNo, float displacement, int maxPower, int maxRpm, int numberOfCylinders) {
        super(modelNo, displacement, maxPower, maxRpm, numberOfCylinders);
    }

    @Override
    public String toString() {
        return "CompressedNaturalGasEngine{" +
                "modelNo='" + modelNo + '\'' +
                ", displacement=" + displacement +
                ", maxPower=" + maxPower +
                ", maxRpm=" + maxRpm +
                ", numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
