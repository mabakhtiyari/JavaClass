package Airport;

import VehiclePack.BodyType;
import VehiclePack.Car;
import VehiclePack.FuelType;

public class Parking {

    private Car[] cars;

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Parking(Car[] cars) {
        this.cars = cars;
    }
}
