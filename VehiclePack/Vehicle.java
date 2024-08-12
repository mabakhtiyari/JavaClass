package VehiclePack;

public class Vehicle implements Drivable {
    private String brandName;
    private FuelType fuelType;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void drive(){
        System.out.println("Vehicle is Moving ...");
    }

    @Override
    public void startEngine(){
        System.out.println("Vehicle is Starting ...");
    }

    public Vehicle(String brandName, FuelType fuelType) {
        this.brandName = brandName;
        this.fuelType = fuelType;
    }
}
