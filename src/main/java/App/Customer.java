package App;

import java.util.List;

public class Customer {

    private Long id;
    private String name;
    private String cpf;
    private String phone;

    private List<Vehicle> vehicles; // relação de um para muitos onde um cliente pode ter vários veículos

    public Customer(Long id, String name, String cpf, String phone, List<Vehicle> vehicles) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.vehicles = vehicles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "id: " + id + "name: " + name + "cpf: " + cpf + "phone: " + phone;
    }
}
