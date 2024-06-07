package App;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Customer> customers = DataFactory.createCustomers();
        Customer customer1 = customers.get(0);
        Customer customer2 = customers.get(1);
        Vehicle vehicle1 = customer1.getVehicles().get(0);

        Yard mainYard = new Yard(1L, "Yard on the first floor", 3.00);
        Yard secondYard = new Yard(2L, "Yard on the second floor", 3.00);

        List<Parking> m1 = new ArrayList<>(); // registro de estacionamento primeiro patio
        List<Parking> s2 = new ArrayList<>(); // registro de estacionamento segundo patio

        Space spacem1 = new Space(1L, 1, mainYard, m1);
        Space spacem2 = new Space(2L, 2, mainYard, m1);
        Space spacem3 = new Space(3L, 3, mainYard, m1);
        Space spacem4 = new Space(4L, 4, mainYard, m1);
        Space spacem5 = new Space(5L, 5, mainYard, m1);

        Space spaceS1 = new Space(1L, 1, secondYard, s2);
        Space spaceS2 = new Space(2L, 2, secondYard, s2);
        Space spaceS3 = new Space(3L, 3, secondYard, s2);
        Space spaceS4 = new Space(4L, 4, secondYard, s2);
        Space spaceS5 = new Space(5L, 5, secondYard, s2);


        String entryTime1 = "2024-06-01T08:30:00";
        String exitTime1 = "2024-06-01T14:45:00";


       //primeiro registro de entrada de veiculo no estacionamento
        Parking register1 = new Parking(1L, null, null, vehicle1, spaceS1);
        register1.setEntry(entryTime1);
        register1.setExit(exitTime1);

        long durationInMinutes1 = register1.calculateDurationInMinutes();

        System.out.println("Duration for register1: " + durationInMinutes1 + " minutes");
        double hours1 = durationInMinutes1 / 60.0;
        double rate1 = hours1 * 3.0; // Taxa de 3 dólares por hora

        System.out.println("Rate for register1: $" + rate1);

        m1.add(register1); // adicionando o registro à lista do pátio m1


        System.out.println("Car: " + register1);

        System.out.println("---------------------------------------------------------");
         System.out.print("Vehicles owned by: " + customer1.getName());
          for (Vehicle vehicle : customer1.getVehicles()) {
              System.out.println(vehicle);
        }


        String entryTime2 = "2024-06-01T08:00:00";
        String exitTime2 = "2024-06-02T15:00:00";

        //segundo registro de entrada de veiculo no estacionamento

        Parking register2 = new Parking(2L, null, null, vehicle1, spaceS1);
        register2.setEntry(entryTime2);
        register2.setExit(exitTime2);

        long durationInMinutes2 = register2.calculateDurationInMinutes();

        System.out.println("---------------------------------------------------------");

        System.out.println("Duration for register2: " + durationInMinutes2 + " minutes");
        double hours2 = durationInMinutes2 / 60.0;
        double rate2 = hours2 * 3.0; // Taxa de 3 dólares por hora

        System.out.println("Rate for register2: $" + rate2);

        m1.add(register2); // adicionando o registro à lista do pátio m1

        System.out.println("Car: " + register2);

        //espaço para mais registros

        System.out.println("---------------------------------------------------------");



        System.out.print("Vehicles owned by: " + customer2.getName());
        for (Vehicle vehicle : customer2.getVehicles()) {
            System.out.println(vehicle);
        }

        System.out.println("---------------------------------------------------------");



    }
}
