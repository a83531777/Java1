package chapter4_2017b11092_2017b11076_2017b11067;

interface Swim {
	public abstract void swim();
}
interface RideBike {
	public abstract void rideBike();
}
interface Running {
	public abstract void running();
}
public  class IronMan implements Swim,RideBike,Running{
	public void swim(){
		System.out.println("我在游泳");
	}
	public void rideBike(){
		System.out.println("我在骑车");
	}
	public void running(){
		System.out.println("我在长跑");
	}
}
