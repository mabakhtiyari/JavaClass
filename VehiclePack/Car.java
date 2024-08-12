package VehiclePack;

public class Car extends Vehicle implements Drivable {
    private BodyType bodyType;

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void drive(){
        System.out.println("Driving");
    }

    @Override
    public void startEngine(){
        System.out.println("Engin is starting");
    }

    public Car(String brandName, FuelType fuelType, BodyType bodyType) {
        super(brandName, fuelType);
        this.bodyType = bodyType;
    }
}
