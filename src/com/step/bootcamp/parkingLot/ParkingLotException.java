package com.step.bootcamp.parkingLot;

class ParkingLotException extends Exception {
    ParkingLotException() {
        super("parking lot has been full");
    }
}
