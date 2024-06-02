package App;

import java.util.List;

public class Space {
//vaga
final Long id;

final int number;
final Yard yard;




 public Space(Long id, int number, Yard yard, List<Parking> parked) {
  this.id = id;
  this.number = number;
  this.yard = yard;

 }


 @Override
 public String toString() {
  return " Space{" +
          "id=" + id +
          ", number=" + number +
          yard +

          '}';
 }
}
