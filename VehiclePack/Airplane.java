package VehiclePack;

public class Airplane extends Vehicle implements Flyable {
    private AirplaneStatus airplaneStatus;

    public AirplaneStatus getAirplaneStatus() {
        return airplaneStatus;
    }

    public void setAirplaneStatus(AirplaneStatus airplaneStatus) {
        this.airplaneStatus = airplaneStatus;
    }

    @Override
    public void takeOff(){
        System.out.println("Flying...");
    }

    public Airplane(String brandName, FuelType fuelType, AirplaneStatus airplaneStatus) {
        super(brandName, fuelType);
        this.airplaneStatus = airplaneStatus;
    }
}
