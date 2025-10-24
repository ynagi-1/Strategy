package org.example;

public class Client {
    public static void main(String[] args) {

        Car car = new Car(new PetrolDriveStrategy());

        car.performDrive();

        car.setDriveStrategy(new ElectricDriveStrategy());
        car.performDrive();

        car.setDriveStrategy(new HybridDriveStrategy());
        car.performDrive();
    }
}
