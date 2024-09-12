package com.design.patterns.structural.facade.pattern.completed;

import com.design.patterns.structural.facade.pattern.starter.CarRentalService;
import com.design.patterns.structural.facade.pattern.starter.FlightBookingService;
import com.design.patterns.structural.facade.pattern.starter.HotelBookingService;
import com.design.patterns.structural.facade.pattern.starter.PaymentService;

public class TravelFacade {
    private FlightBookingService flightBookingService;
    private HotelBookingService hotelBookingService;
    private CarRentalService carRentalService;
    private PaymentService paymentService;

    public TravelFacade() {
        this.flightBookingService = new FlightBookingService();
        this.hotelBookingService = new HotelBookingService();
        this.carRentalService = new CarRentalService();
        this.paymentService = new PaymentService();
    }

    // Unified method to book a travel package
    public void bookCompletePackage(String flightDetails, String hotelDetails,
                                    String carDetails, String paymentDetails) {
        flightBookingService.bookFlight(flightDetails);
        hotelBookingService.bookHotel(hotelDetails);
        carRentalService.bookCarRental(carDetails);
        paymentService.processPayment(paymentDetails);
        System.out.println("Travel package booked successfully!");
    }
}
