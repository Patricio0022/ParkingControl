package App;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        Model model1 = new Model(1L, "Suv");
        Model model2 = new Model(2L, "Palio");
        Model model3 = new Model(3L, "Gipe");
        Model model4 = new Model(4L, "BMW");
        Model model5 = new Model(5L, "Civic");
        Model model6 = new Model(6L, "Corolla");
        Model model7 = new Model(7L, "Fusion");
        Model model8 = new Model(8L, "Camaro");
        Model model9 = new Model(9L, "Mustang");

        Color color1 = new Color(1L, "Red");
        Color color2 = new Color(2L, "Blue");
        Color color3 = new Color(3L, "Green");
        Color color4 = new Color(4L, "Yellow");
        Color color5 = new Color(5L, "Black");
        Color color6 = new Color(6L, "White");
        Color color7 = new Color(7L, "Silver");
        Color color8 = new Color(8L, "Purple");


        Vehicle vehicle1 = new Vehicle(1L,"ABC-1234", model1, color2);
        Vehicle vehicle2 = new Vehicle(2L, "CDT-9933", model2, color1);
        Vehicle vehicle3 = new Vehicle(3L, "TYA-4579", model3, color3);
        Vehicle vehicle4 = new Vehicle(4L, "FFG-1133", model4, color1);

        List<Vehicle> vehiclesc1 = new ArrayList<>();
        vehiclesc1.add(vehicle1);

        List<Vehicle> vehiclesc2 = new ArrayList<>();
        vehiclesc2.add(vehicle2);

        List<Vehicle> vehiclesc3 = new ArrayList<>();
        vehiclesc3.add(vehicle3);

        List<Vehicle> vehiclesc4 = new ArrayList<>();
        vehiclesc4.add(vehicle4);

        Customer customer1 = new Customer(1L, "Mariana Silva", "12332323227" , "31981742986", vehiclesc1);
        Customer customer2 = new Customer(2L, "Thiago Fonseca","12009933310" , "31911772986" ,vehiclesc2);
        Customer customer3 = new Customer(3L, "Oliver Fernandes", "12339990022" , "31991740986" ,vehiclesc3);
        Customer customer4 = new Customer(4L, "Ana Carolina", "44999222112" , "31983742986", vehiclesc4);

        Yard mainYard = new Yard(1L, "Yard on the first floor", 3.00);
        Yard secondYard = new Yard(2L, "Yard on the second floor", 3.00);

        List<Parking> m1 = new ArrayList<>();// registro de estacionamento primeiro patio

        List<Parking> s2= new ArrayList<>();// registro de estacionamento segundo patio

        Space spacem1 = new Space(1L,1, mainYard, m1);
        Space spacem2 = new Space(1L,2, mainYard, m1);
        Space spacem3 = new Space(1L,3, mainYard, m1);
        Space spacem4 = new Space(1L,4, mainYard, m1);
        Space spacem5 = new Space(1L,5, mainYard, m1);


        Space spaceS1 = new Space(1L, 1, secondYard,s2);
        Space spaceS2 = new Space(2L, 2, secondYard,s2);
        Space spaceS3 = new Space(3L, 3, secondYard,s2);
        Space spaceS4 = new Space(4L, 4, secondYard,s2);
        Space spaceS5 = new Space(5L, 5, secondYard,s2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String entryString = "2024-05-25 10:00:00";
        String exitString = "2024-05-25 15:30:00";

        LocalDateTime entry = LocalDateTime.parse(entryString, formatter);
        LocalDateTime exit = LocalDateTime.parse(exitString, formatter);


        Parking register1 = new Parking(1L, );


        System.out.print("Vehicles owned by: " + customer1.getName() );


        for (Vehicle vehicle : customer1.getVehicles()) {
            System.out.println(vehicle);


        }

        System.out.println("---------------------------------------------------------");

        System.out.print("Vehicles owned by: " + customer2.getName() );

        for (Vehicle vehicle : customer2.getVehicles()) {
            System.out.println(vehicle);


        }















    }
}