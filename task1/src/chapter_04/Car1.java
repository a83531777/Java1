package chapter_04;

class Car{
    public      String make;
    protected int      weight;
    private     String color;
   
    private Car(String make,int weight,String color){
            this.make=car.make;
            this.weight=car.weight;
            this.color = car.color;
    }
    public Car(){
           this("unknown",-1,"white");
    }
}
class ElectricCar extends Car{
  private      int rechargeHour;
  public ElectricCar(){   this(10); }
  public ElectricCar(int charge){
     super();
      this.rechargeHour=charge;
  }
}
class TestMain{
    public static void main(String[] args){
           Car myCar1,myCar2;
           ElectricCar myElec1,myElec2;
           myCar1 = new Car();
           myCar2= new Car("Ford",1200,"Green");
           myElec1= new ElectricCar();
           myElec2 = new ElectircCar(15);
         
    }
}