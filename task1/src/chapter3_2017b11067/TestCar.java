package chapter3_2017b11067;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car honda = new Car();
		honda.color = "红色";
		honda.brand = "本田";
		honda.type = "轿车";
		honda.price = (float ) 15.6;
		honda.year = 2010;
		honda.setNote("红色本田，9成新，一口价，非诚勿扰！");
		honda.showInfo();
	}

}
