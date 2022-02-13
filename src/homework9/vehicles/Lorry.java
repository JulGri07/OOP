package homework9.vehicles;

import homework9.details.Engine;
import homework9.professions.Driver;

public class Lorry extends Car{
    private int bodyLoadCapacity;

    public Lorry(String carBrand, String carClass, double carWeight, Driver carDriver, Engine carEngine, int bodyLoadCapacity){
        super(carBrand, carClass, carWeight, carDriver, carEngine);
        this.bodyLoadCapacity = bodyLoadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "liftingCapacity=" + bodyLoadCapacity +
                "} " + super.toString();
    }
}

