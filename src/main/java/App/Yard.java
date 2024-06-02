package App;

import java.util.List;

public class Yard {
//patio
    private Long id;

    private String description;

    private double tax;




    public Yard(Long id, String description, double tax) {
        this.id = id;
        this.description = description;
        this.tax = tax;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


    @Override
    public String toString() {
        return " Yard{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", tax=" + tax +
                '}';
    }
}
