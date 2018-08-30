package chapter_04;

class Car{
    public      String make;
    protected int      weight;
    private     String color;

}
class ElectricCar extends Car{
  private      int rechargeHour;
  public ElectricCar(){}
  public ElectricCar(ElectricCar car){
      this.make=car.make;
      this.weight=car.weight;
      this.color = car.color;         
      this.rechargeHour=car.rechargeHour;
  }

}
class TestMain{
    public static void main(String[] args){
           Car myCar;
           ElectricCar myElecCar;
           myCar = new Car();
           myCar.make="Chevy";
           myCar.weight = 1000;
           myCar.color="red";

          myElecCar = new ElectricCar();
          myElecCar.make = "Chevy";
          myElecCar.weight= 500;
          myElecCar.color="Silver";
          myElecCar.rechargeHour=3;
    }
}

