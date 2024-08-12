package Airport;

import VehiclePack.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Airplane mahan1 = new Airplane("Mahan", FuelType.Diesel, AirplaneStatus.OnTime);
        Airplane sina5 = new Airplane("SinaAir", FuelType.Gasoline, AirplaneStatus.TakingPassengers);
        Airplane kishAir1 = new Airplane("MalekiAirLine", FuelType.WhiteGasoline, AirplaneStatus.WithDelay);
        Helicopter redBird1 = new Helicopter("Aseman Peyma", FuelType.Diesel);
        Helicopter hotBird2 = new Helicopter("Fazayii", FuelType.Gasoline);
        Airplane[] airplanes = new Airplane[]{mahan1, sina5, kishAir1};
        Helicopter[] helicopters = new Helicopter[]{redBird1, hotBird2};
        Airport mehrAbad = new Airport(airplanes, helicopters);

        Car pride = new Car("Pride", FuelType.Gasoline, BodyType.Coupe);
        Car bmw = new Car("BMW", FuelType.Diesel, BodyType.Sedan);
        Car benz = new Car("Mercedes Benz", FuelType.WhiteGasoline, BodyType.SUV);
        Car[] cars = new Car[]{pride, benz, bmw};
        Parking parking1 = new Parking(cars);

        for (Airplane airplane : airplanes) {
            System.out.println(airplane.getFuelType().getValue());
        }

        for (Helicopter helicopter :mehrAbad.getHelicopter()) {
            System.out.println(helicopter.getBrandName());
        }
        System.out.println(mehrAbad.getClass());


    }
}
