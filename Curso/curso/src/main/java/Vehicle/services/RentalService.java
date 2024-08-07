package Vehicle.services;

import Vehicle.entities.CarRental;

public class RentalService {

    private double pricePerDay;
    private double pricePerHour;

    private BrazilTaxService taxService;

    public RentalService(double pricePerDay, double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        carRental.setInvoice(null);

    }
}
