package com.step.bootcamp.parkingLot;

import java.util.ArrayList;
import java.util.List;

class ParkingLot {

    private List<Vehicle> vehicleList;
    private Integer capacity;
    private Attendant attendant;

    ParkingLot(Integer capacity, Attendant attendant) {
        this.vehicleList = new ArrayList<>(capacity);
        this.capacity = capacity;
        this.attendant = attendant;
    }

    void park(Vehicle vehicle) throws ParkingLotException {
        if (isFull()) {
            notifyAttendant();
            throw new ParkingLotException();
        }
        vehicleList.add(vehicle);
    }

    private boolean isFull() {
        return vehicleList.size() == capacity;
    }

    private void notifyAttendant() {
        attendant.update(this);
    }

}
