package com.kodilla.exception.test;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;


public class Airport {


    private static Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> listOfAirports = new HashMap<>();
        listOfAirports.put("WARSAW", true);
        listOfAirports.put("LONDON", false);
        listOfAirports.put("PARIS", true);

        if (!(listOfAirports.get(flight.getDepartureAirport())== null ||
                (listOfAirports.get(flight.getArrivalAirport())== null)))
        {
            throw new RouteNotFoundException("Not exists");
        }

    return listOfAirports;

}
    public static void main (String[] args) {
        Flight flight = new Flight("Sydney", "Los Angeles");
        try {
            findFlight(flight);
            System.out.println("This flight exist");
        } catch (RouteNotFoundException e) {
            System.out.println("Flight does not exist" + e);

        } finally {
            System.out.println("Find a new route" + LocalTime.now());
        }
    }
}
