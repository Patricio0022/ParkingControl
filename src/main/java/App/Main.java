package App;

import App.Entities.Customer;
import App.Entities.Parking;
import App.Entities.Space;
import App.Entities.Vehicle;
import App.Util.DataFactory;

import java.util.List;

public class Main {
    private static final double PARKING_RATE_PER_HOUR = 3.0;

    public static void main(String[] args) {
        List<Customer> customers = DataFactory.createCustomers();
        Customer customer1 = customers.get(0);
        Customer customer2 = customers.get(1);
        Customer customer3 = customers.get(2);//index of list customers
        Vehicle vehicle1 = customer1.getVehicles().get(0);//index of customers vehicles
        Vehicle vehicle2 = customer2.getVehicles().get(0);
        Vehicle vehicle3 = customer3.getVehicles().get(0);

        List<Space> spaceM1 = DataFactory.createSpaceMainYard();
        List<Space> spaceS2 = DataFactory.createSpaceSecondYard();

        String entryTime1 = "2024-06-01T08:30:00";
        String exitTime1 = "2024-06-01T14:45:00";

        Parking register1 = createAndCalculateParkingRecord(1L, vehicle1, spaceM1.get(0), entryTime1, exitTime1);
        DataFactory.Parking1().add(register1);
        printCustomerVehicles(customer1);

        String entryTime2 = "2024-06-01T08:00:00";
        String exitTime2 = "2024-06-02T15:00:00";

        Parking register2 = createAndCalculateParkingRecord(2L, vehicle2, spaceS2.get(0), entryTime2, exitTime2);
        DataFactory.Parking2().add(register2);
        printCustomerVehicles(customer2);

        String entryTime3 = "2024-06-01T08:00:00";
        String exitTime3 = "2024-06-02T18:00:00";

        Parking register3 = createAndCalculateParkingRecord(3L, vehicle3, spaceS2.get(1), entryTime3, exitTime3);
        DataFactory.Parking2().add(register3);
        printCustomerVehicles(customer3);

        System.out.println("---------------------------------------------------------");
        System.out.println("Parkeds in Parking1: " + DataFactory.Parking1().toString());
        System.out.println("---------------------------------------------------------");
        System.out.println("Parkeds in Parking2: " + DataFactory.Parking2().toString());
        System.out.println("---------------------------------------------------------");
    }

    private static Parking createAndCalculateParkingRecord(Long id, Vehicle vehicle, Space space, String entryTime, String exitTime) {
        Parking register = new Parking(id, null, null, vehicle, space);
        register.setEntry(entryTime);
        register.setExit(exitTime);
        System.out.println("---------------------------------------------------------");
        long durationInMinutes = register.calculateDurationInMinutes();
        System.out.println("Duration for register " + id + ": " + durationInMinutes + " minutes");
        double hours = durationInMinutes / 60.0;
        double rate = hours * PARKING_RATE_PER_HOUR;
        System.out.println("Rate for register " + id + ": $" + rate);
        System.out.println("---------------------------------------------------------");
        return register;
    }

    private static void printCustomerVehicles(Customer customer) {
        System.out.print("Vehicles owned by " + customer.getName() + ": ");
        for (Vehicle vehicle : customer.getVehicles()) {
            System.out.println(vehicle);
        }
        System.out.println();
    }
}
