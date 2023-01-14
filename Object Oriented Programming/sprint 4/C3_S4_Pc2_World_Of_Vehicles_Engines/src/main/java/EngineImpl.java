public class EngineImpl {
    public static void main(String[] args) {
        PetrolEngine petrolEngine = new PetrolEngine("BMW101TX5004",30.4f,635,4000,4);
        DieselEngine dieselEngine = new DieselEngine("JAGUAR XF",3.0f,201,4250,4);
        CompressedNaturalGasEngine compressedNaturalGasEngine = new CompressedNaturalGasEngine("TATA PUNCH CNG",1199.0f,73,6000,3);
        ElectricEngine electricEngine = new ElectricEngine("xyz",0,200,10000,3,360);
        System.out.println(petrolEngine);
        System.out.println(dieselEngine);
        System.out.println(compressedNaturalGasEngine);
        System.out.println(electricEngine);

    }
}
