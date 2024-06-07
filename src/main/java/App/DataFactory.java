package App;

import java.util.ArrayList;
import java.util.List;


public class DataFactory {

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

        List<Vehicle> vehiclesc1 = new ArrayList<>();
        vehiclesc1.add(new Vehicle(1L, "ABC-1234", createModels().get(0), createColors().get(1)));

        List<Vehicle> vehiclesc2 = new ArrayList<>();
        vehiclesc2.add(new Vehicle(2L, "CDT-9933", createModels().get(1), createColors().get(0)));

        List<Vehicle> vehiclesc3 = new ArrayList<>();
        vehiclesc3.add(new Vehicle(3L, "TYA-4579", createModels().get(2), createColors().get(2)));

        List<Vehicle> vehiclesc4 = new ArrayList<>();
        vehiclesc4.add(new Vehicle(4L, "FFG-1133", createModels().get(3), createColors().get(0)));

        customers.add(new Customer(1L, "Oliver Queen", "12332323227", "31981742986", vehiclesc1));
        customers.add(new Customer(2L, "Bruce Wayne", "12009933310", "31911772986", vehiclesc2));
        customers.add(new Customer(3L, "Clark Kent", "12339990022", "31991740986", vehiclesc3));
        customers.add(new Customer(4L, "Sakura Haruno", "44999222112", "31983742986", vehiclesc4));

        return customers;
    }


    // Adicione métodos para criar outras instâncias conforme necessário
}
