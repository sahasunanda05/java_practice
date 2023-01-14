package com.vehicles;

public class VehicleService {
    public static void main(String[] args) {
        Bike bike = new Bike("Yamaha","Yamaha FZ S","sportsBike");
        System.out.println("Bike type is "+bike.getVehicleType()+" its speed is "+bike.maxSpeed(bike.getVehicleType()));
        System.out.println(bike.getManufacturerInformation());
        Car car = new Car("Santro","Santro123","sedan");
        System.out.println("Car type is "+car.getVehicleType()+" its speed is "+car.maxSpeed(car.getVehicleType()));
        System.out.println(car.getManufacturerInformation());


    }
}
