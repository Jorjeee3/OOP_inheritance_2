package Vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage<Car> carGarage = new Garage<Car>();
        Garage<Motorcycle> motorcycleGarage = new Garage<Motorcycle>();

        Scanner scanner = new Scanner(System.in);;

        System.out.println("Enter name for the car: ");
        String carName = scanner.nextLine();
        Car car = new Car(carName);
        carGarage.setVehicle(car);

        System.out.println("Enter name for the motorcycle: ");
        String motorcycleName = scanner.nextLine();
        Motorcycle motorcycle = new Motorcycle(motorcycleName);
        motorcycleGarage.setVehicle(motorcycle);

        System.out.println("Car name in car garage is " + carGarage.getVehicle().getName());
        System.out.println("Motorcycle name in motorcycler garage is " + motorcycleGarage.getVehicle().getName());
    }
}
