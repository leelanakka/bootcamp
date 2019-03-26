package com.step.bootcamp.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Attendant {
    private List<ParkingLot> fullParkingLots;
    private List<ParkingLot> freeParkingLots;

    Attendant() {
        this.fullParkingLots = new ArrayList<>();
        this.freeParkingLots = new ArrayList<>();
    }

    public void add(ParkingLot parkingLot) {
        this.freeParkingLots.add(parkingLot);
    }

    void update(ParkingLot parkingLot) {
        if (freeParkingLots.contains(parkingLot)) {
            freeParkingLots.remove(parkingLot);
            fullParkingLots.add(parkingLot);
            return;
        }
        fullParkingLots.remove(parkingLot);
        freeParkingLots.add(parkingLot);
    }
}
