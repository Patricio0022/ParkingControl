package App;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Parking {
//estacionamento
    private Long id;

    private int valueP;

    private String entry;
    private String exit;

    private Vehicle vehicle;

    private Space space;

    public Parking(Long id, String entry, String exit, Vehicle vehicle, Space space) {
        this.id = id;
        this.vehicle = vehicle;
        this.space = space;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValueP() {
        return valueP;
    }

    public void setValueP(int valueP) {
        this.valueP = valueP;
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

    public long calculateDurationInMinutes() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        LocalDateTime entryTime = LocalDateTime.parse(this.entry, formatter);
        LocalDateTime exitTime = LocalDateTime.parse(this.exit, formatter);

        Duration duration = Duration.between(entryTime, exitTime);
        return duration.toMinutes();
    }

    @Override
    public String toString() {
        return "Parking{" +
                "id=" + id +
                ", entry='" + entry + '\'' +
                ", exit='" + exit + '\'' +
                ", vehicle=" + vehicle +
                 space +
                '}';
    }
}
