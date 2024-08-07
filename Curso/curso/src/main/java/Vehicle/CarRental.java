package Vehicle;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental() {
    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle, Invoice invoice) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
        this.invoice = invoice;
    }


}
