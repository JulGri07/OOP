package homework9.vehicles;

import homework9.details.Engine;
import homework9.professions.Driver;

public interface ICar {
    public String getCarBrand();
    public void setCarBrand(String carBrand);
    public String getCarClass();
    public void setCarClass(String carClass);
    public double getCarWeight();
    public void setCarWeight(double carWeight);

    public Driver getCarDriver();
    public void setCarDriver(Driver carDriver);

    public Engine getCarEngine();
    public void setCarEngine(Engine carEngine);

    public void start();
    public void stop();
    public void turnRight();
    public void turnLeft();
}
