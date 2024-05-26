package App;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class Parking {
//estacionamento
    private Long id;
    private String entry;
    private  String exit;

    private int valueP;

    private Vehicle vehicle;

    private Space space;


    public Parking(Long id, String entry, String exit, Vehicle vehicle, Space space) {
        this.id = id;
        this.entry = entry;
        this.exit = exit;
        this.vehicle = vehicle;
        this.space = space;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
}
