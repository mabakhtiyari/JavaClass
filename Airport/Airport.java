package Airport;

import VehiclePack.*;

import java.util.List;

public class Airport {
    private Airplane[] airplanes;
    private Helicopter[] helicopters;

    public Airplane[] getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(Airplane[] airplanes) {
        this.airplanes = airplanes;
    }

    public Helicopter[] getHelicopter() {
        return helicopters;
    }

    public void setHelicopter(Helicopter[] helicopter) {
        this.helicopters = helicopter;
    }

    public Airport(Airplane[] airplanes, Helicopter[] helicopters) {
        this.airplanes = airplanes;
        this.helicopters = helicopters;
    }
}
