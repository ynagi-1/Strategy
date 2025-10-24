package org.example;

class PetrolDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving using petrol engine.");
    }
}
class ElectricDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving using electric motor.");
    }
}
class HybridDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving using hybrid mode (petrol + electric).");
    }
}