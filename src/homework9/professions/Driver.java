package homework9.professions;

public class Driver extends Person {

    private int drivingExperience;

    public Driver(String name, int drivingExperience) {
        super(name, drivingExperience);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience='" + drivingExperience + '\'' +
                "} " + super.toString();
    }
}
