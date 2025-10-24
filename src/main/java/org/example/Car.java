package org.example;

public class Car {

    private DriveStrategy driveStrategy;

    public Car(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void performDrive() {
        if (driveStrategy == null) {
            System.out.println("No driving strategy selected!");
        } else {
            driveStrategy.drive();
        }
    }
}
