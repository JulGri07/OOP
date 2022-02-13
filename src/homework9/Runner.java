package homework9;

import homework9.details.Engine;
import homework9.professions.Driver;
import homework9.professions.Person;
import homework9.vehicles.Car;
import homework9.vehicles.Lorry;
import homework9.vehicles.SportCar;

public class Runner {
    public static void main(String[] args) {
        Driver someDriver = new Driver("Max", 5);
        Person somePerson = new Person("Phil", 0);
        Engine someEngine = new Engine(500, "Ford");
        Car someCar = new Car("Reno", "VS", 1111,
                                new Driver("Vasya", 3),
                                new Engine(1000, "Yamaha"));
        Lorry someLorry = new Lorry("Mercedes-Benz", "D", 1234, someDriver,someEngine, 9999);
        SportCar ferrari = new SportCar("lamborghini", "F1", 1234, someDriver,someEngine, 1000);

        System.out.println(someCar);
        System.out.println(someLorry);
        System.out.println(ferrari);


        someCar.start();
        someCar.turnLeft();
        someCar.turnRight();
        someCar.stop();

    }
}
