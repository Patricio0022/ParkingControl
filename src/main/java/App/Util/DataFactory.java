package App.Util;

import java.util.ArrayList;
import java.util.List;

import App.Entities.*;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;



public class DataFactory {



    private static final List<Parking> parking1 = new ArrayList<>();
    private static final List<Parking> parking2 = new ArrayList<>();

    @NotNull
    public static List<Parking> Parking1() {
        return parking1;
    }

    @NotNull
    public static List<Parking> Parking2() {
        return parking2;
    }

   // List<Parking> m1 = new ArrayList<>(); // registro de estacionamento primeiro patio
   // List<Parking> s2 = new ArrayList<>(); // registro de estacionamento segundo patio

    public static List<Yard> createYards(){
        List<Yard> yards = new ArrayList<>();
        yards.add(new Yard(1L, "Yard on the first floor", 3.00));
        yards.add(new Yard(2L, "Yard on the second floor", 3.00));
        return yards;
    }

    public static List<Space> createSpaceMainYard(){
        List<Space> spacesM1 = new ArrayList<>();
        spacesM1.add(new Space(1L, 1, createYards().get(0), Parking1()));// 0
        spacesM1.add(new Space(2L, 2, createYards().get(0), Parking1()));// 1
        spacesM1.add(new Space(3L, 3, createYards().get(0), Parking1()));// 2
        spacesM1.add(new Space(4L, 4, createYards().get(0), Parking1()));// 3
        spacesM1.add(new Space(5L, 5, createYards().get(0), Parking1()));// 4


        return spacesM1;

    }

    public static List<Space> createSpaceSecondYard(){
        List<Space> spacesS1 = new ArrayList<>();
        spacesS1.add(new Space(1L, 1, createYards().get(1), Parking2()));
        spacesS1.add(new Space(2L, 2, createYards().get(1), Parking2()));
        spacesS1.add(new Space(3L, 3, createYards().get(1), Parking2()));
        spacesS1.add(new Space(4L, 4, createYards().get(1), Parking2()));
        spacesS1.add(new Space(5L, 5, createYards().get(1), Parking2()));



        return spacesS1;

    }

    public static List<Model> createModels() {
        List<Model> models = new ArrayList<>();
        models.add(new Model(1L, "Suv"));
        models.add(new Model(2L, "Palio"));
        models.add(new Model(3L, "Gipe"));
        models.add(new Model(4L, "BMW"));
        models.add(new Model(5L, "Civic"));
        models.add(new Model(6L, "Corolla"));
        models.add(new Model(7L, "Fusion"));
        models.add(new Model(8L, "Camaro"));
        models.add(new Model(9L, "Mustang"));
        return models;
    }

    public static List<Color> createColors() {
        List<Color> colors = new ArrayList<>();
        colors.add(new Color(1L, "Red"));
        colors.add(new Color(2L, "Blue"));
        colors.add(new Color(3L, "Green"));
        colors.add(new Color(4L, "Yellow"));
        colors.add(new Color(5L, "Black"));
        colors.add(new Color(6L, "White"));
        colors.add(new Color(7L, "Silver"));
        colors.add(new Color(8L, "Purple"));
        return colors;
    }

    public static List<Customer> createCustomers() {
        List<Customer> customers = new ArrayList<>();

        List<Vehicle> vehiclesC1 = new ArrayList<>();
        vehiclesC1.add(new Vehicle(1L, "ABC-1234", createModels().get(0), createColors().get(1)));

        List<Vehicle> vehiclesC2 = new ArrayList<>();
        vehiclesC2.add(new Vehicle(2L, "CDT-9933", createModels().get(1), createColors().get(0)));

        List<Vehicle> vehiclesC3 = new ArrayList<>();
        vehiclesC3.add(new Vehicle(3L, "TYA-4579", createModels().get(2), createColors().get(2)));

        List<Vehicle> vehiclesC4 = new ArrayList<>();
        vehiclesC4.add(new Vehicle(4L, "FFG-1133", createModels().get(3), createColors().get(0)));

        customers.add(new Customer(1L, "Oliver Queen", "12332323227", "31981742986", vehiclesC1));
        customers.add(new Customer(2L, "Bruce Wayne", "12009933310", "31911772986", vehiclesC2));
        customers.add(new Customer(3L, "Clark Kent", "12339990022", "31991740986", vehiclesC3));
        customers.add(new Customer(4L, "Sakura Haruno", "44999222112", "31983742986", vehiclesC4));

        return customers;
    }





    // instancias
}
