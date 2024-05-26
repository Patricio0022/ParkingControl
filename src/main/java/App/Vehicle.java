package App;

public class Vehicle {

    private Long id;
    private String board;
    Model model;
    Color color;

 public Vehicle (Long id, String board, Model model, Color color ){
     this.id = id;
     this.board = board;
     this.model = model;
     this.color = color;

 }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }



    @Override
    public String toString() {
        return " id: " + id + " board: " + board + " \n model[ " + model + "]" + " color[ " + color + "]";
    }

}
