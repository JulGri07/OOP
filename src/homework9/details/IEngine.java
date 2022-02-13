package homework9.details;

public interface IEngine {
    public void Engine(double carPower, String carManufacturer);

    public double getCarPower();
    public void setCarPower(double carPower);
    public String getCarManufacturer();
    public void setCarManufacturer(String carManufacturer);
}
