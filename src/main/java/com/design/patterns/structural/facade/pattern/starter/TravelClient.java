package com.design.patterns.structural.facade.pattern.starter;

public class TravelClient {
    public static void main(String[] args) {
        String flightDetails = "Flight from NYC to Paris";
        String hotelDetails = "Hotel in Paris for 5 nights";
        String carDetails = "Car rental in Paris";
        String paymentDetails = "Payment for entire package";

        // Client manually interacts with all subsystems
        FlightBookingService flightService = new FlightBookingService();
        flightService.bookFlight(flightDetails);

        HotelBookingService hotelService = new HotelBookingService();
        hotelService.bookHotel(hotelDetails);

        CarRentalService carService = new CarRentalService();
        carService.bookCarRental(carDetails);

        PaymentService paymentService = new PaymentService();
        paymentService.processPayment(paymentDetails);

        System.out.println("Travel package booked successfully!");
    }
}
