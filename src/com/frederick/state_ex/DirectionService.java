package com.frederick.state_ex;

public class DirectionService {
    private TravelMode travelMode;

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public int getEta() {
        if (travelMode != null) {
            return travelMode.getEta();
        }
        else {
            System.out.println("Calculating ETA (walking)");
            return 4;
        }
    }

    public int getDirection() {
        if (travelMode != null) {
            return travelMode.getDirection();
        }
        else {
            System.out.println("Calculating Direction (walking)");
            return 4;
        }
    }
}
