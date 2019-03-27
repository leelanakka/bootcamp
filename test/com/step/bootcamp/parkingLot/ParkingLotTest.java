package com.step.bootcamp.parkingLot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void shouldParkTheVehicle() {
        Attendant attendant = new Attendant();
        ParkingLot parkingLot = new ParkingLot(20, attendant);
        assertDoesNotThrow(() -> parkingLot.park(new Vehicle("Car")));
    }

    @Test
    void shouldNotParkTheVehicleIfTheParkingLotIsFull() throws ParkingLotException {
        Attendant attendant = new Attendant();
        ParkingLot parkingLot = new ParkingLot(1, attendant);
        parkingLot.park(new Vehicle("Bike"));
        assertThrows(ParkingLotException.class, () -> parkingLot.park(new Vehicle("Car")));
    }

    @Test
    void shouldNotifyAttendantIfTheParkingLotIsFull() throws ParkingLotException {

        TestAttendant testAttendant = new TestAttendant();
        ParkingLot parkingLot = new ParkingLot(1, testAttendant);
        parkingLot.park(new Vehicle("car"));

        try {
            parkingLot.park(new Vehicle("Jeep"));
        } catch (ParkingLotException e) {
            assertTrue(testAttendant.isUpdated);
        }
    }


    @Test
    void shouldUnParkAndNotifyTheExistingCar() throws ParkingLotException {
        Attendant attendant = new Attendant();
        ParkingLot parkingLot = new ParkingLot(1, attendant);
        parkingLot.park(new Vehicle("Bike"));
        assertThrows(ParkingLotException.class, () -> parkingLot.park(new Vehicle("Car")));
    }
}

class TestAttendant extends Attendant {
    boolean isUpdated = false;

    @Override
    void update(ParkingLot parkingLot) {
        isUpdated = true;
    }
}