package VehiclePack;

public class Helicopter extends Vehicle implements Flyable {



    @Override
    public void takeOff(){
        System.out.println("Helicopter Is Taking Off");
    }

    public void verticalTakeOff(){
        System.out.println("Helicopter Is Taking Off Vertically");
    }

    public Helicopter(String brandName, FuelType fuelType) {
        super(brandName, fuelType);
    }
}
