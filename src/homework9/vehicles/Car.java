package homework9.vehicles;

import homework9.details.Engine;
import homework9.professions.Driver;

public class Car implements ICar {
    private String carBrand;
    protected String carClass;
    private double carWeight;
    private Driver carDriver;
    private Engine carEngine;


    public Car(String carBrand, String carClass, double carWeight, Driver carDriver, Engine carEngine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.carDriver = carDriver;
        this.carEngine = carEngine;

    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public Driver getCarDriver() {
        return carDriver;
    }

    public void setCarDriver(Driver carDriver) {
        this.carDriver = carDriver;
    }

    public Engine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(Engine carEngine) {
        this.carEngine = carEngine;
    }

    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + carBrand + '\'' +
                ", Class='" + carClass + '\'' +
                ", weight=" + carWeight +
                ", driver=" + carDriver +
                ", engine=" + carEngine +
                "}";
    }

}
