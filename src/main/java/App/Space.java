package App;

import java.util.List;

public class Space {
//vaga
private Long id;

private int number;
 Yard yard;

private List<Parking> parked;


 public Space(Long id, int number, Yard yard, List<Parking> parked) {
  this.id = id;
  this.number = number;
  this.yard = yard;
  this.parked = parked;
 }

 public Long getId() {
  return id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public int getNumber() {
  return number;
 }

 public void setNumber(int number) {
  this.number = number;
 }

 public Yard getYard() {
  return yard;
 }

 public void setYard(Yard yard) {
  this.yard = yard;
 }

 public List<Parking> getParked() {
  return parked;
 }

 public void setParked(List<Parking> parked) {
  this.parked = parked;
 }
}
