package com.frederick.state_ex;

public class Main {
    public static void main(String[] args) {
        DirectionService service = new DirectionService();

        System.out.println("getEta(): " + service.getEta());
        System.out.println("getDirection(): " + service.getDirection());

        service.setTravelMode(new TransitTravelMode());
        System.out.println("getEta(): " + service.getEta());
        System.out.println("getDirection(): " + service.getDirection());

        service.setTravelMode(new BicyclingTravelMode());
        System.out.println("getEta(): " + service.getEta());
        System.out.println("getDirection(): " + service.getDirection());

        service.setTravelMode(new DrivingTravelMode());
        System.out.println("getEta(): " + service.getEta());
        System.out.println("getDirection(): " + service.getDirection());
    }
}
