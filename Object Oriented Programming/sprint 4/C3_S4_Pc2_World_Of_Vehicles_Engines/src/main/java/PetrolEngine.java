public class PetrolEngine extends Engine{

    public PetrolEngine(String modelNo, float displacement, int maxPower, int maxRpm, int numberOfCylinders) {
        super(modelNo, displacement, maxPower, maxRpm, numberOfCylinders);
    }

    @Override
    public String toString() {
        return "PetrolEngine{" +
                "modelNo='" + modelNo + '\'' +
                ", displacement=" + displacement +
                ", maxPower=" + maxPower +
                ", maxRpm=" + maxRpm +
                ", numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
