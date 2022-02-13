package homework9.details;

public class Engine {
    private double carPower;
    private String carManufacturer;

    public Engine(double carPower, String carManufacturer) {
        this.carPower = carPower;
        this.carManufacturer = carManufacturer;
    }

    public double getCarPower() {
        return carPower;
    }

    public void setCarPower(double carPower) {
        this.carPower = carPower;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power='" + carPower + '\'' +
                ", producer='" + carManufacturer + '\'' +
                '}';
    }
}
