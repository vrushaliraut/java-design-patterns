package com.design.patterns.structural.facade.pattern.completed;

public class TravelClient {
    public static void main(String[] args) {
        String flightDetails = "Flight from NYC to Paris";
        String hotelDetails = "Hotel in Paris for 5 nights";
        String carDetails = "Car rental in Paris";
        String paymentDetails = "Payment for entire package";

        // Client interacts only with the facade
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.bookCompletePackage(flightDetails, hotelDetails, carDetails, paymentDetails);
    }
}
