package Test;

interface Swim{
	abstract void swim();
}
interface RideBike{
	abstract void riding();
}
interface Running{
	abstract void running();
}
interface Iironman extends Swim,RideBike,Running{
	
}

public class IronMan implements Iironman {
		public void swim(){
			System.out.println("我在游泳");
		}
		public void riding(){
			System.out.println("我在骑车");
		}
		public void running(){
			System.out.println("我在长跑");
		}
}