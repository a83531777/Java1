package chapter4_2017b11092_2017b11076_2017b11067;

public class Bike {
	void maxSpeed() {
		System.out.println("自行车的最高时速是30 公里");
	}
}
class Ebike extends Bike{
	void maxSpeed() {
		System.out.println("电动自行车的最高时速是40 公里");
	}
}
