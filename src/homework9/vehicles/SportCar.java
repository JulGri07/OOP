package homework9.vehicles;

import homework9.details.Engine;
import homework9.professions.Driver;

public class SportCar extends Car{
    private double topSpeed;

    public SportCar(String carBrand, String carClass, double carWeight, Driver carDriver, Engine carEngine, double topSpeed) {
        super(carBrand, carClass, carWeight, carDriver, carEngine);
        this.topSpeed = topSpeed;
    }
    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + topSpeed +
                "} " + super.toString();
    }

}
