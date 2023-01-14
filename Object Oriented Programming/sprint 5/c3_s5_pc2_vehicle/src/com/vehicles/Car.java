package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle{

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName,vehicleModelName,vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        switch (vehicleType){
            case "SportsCar" : return 250;
            case "sedan" : return 170;
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return "Car{" +
                "Manufacturer name:'" + getVehicleName() + '\'' +
                ", Model Name:'" + getVehicleModelName() + '\'' +
                ", Type:'" + getVehicleType() + '\'' +
                '}';
    }
}

