package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle{

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName,vehicleModelName,vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        switch (vehicleType){
            case "sportsBike" : return 250;
            case "cruiser" : return 170;
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation() {
       return "Bike{" +
                "Manufacturer name:'" + getVehicleName() + '\'' +
                ", Model Name:'" + getVehicleModelName() + '\'' +
                ", Type:'" + getVehicleType() + '\'' +
                '}';
    }
}
