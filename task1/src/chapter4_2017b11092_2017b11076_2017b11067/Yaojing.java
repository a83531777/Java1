package chapter4_2017b11092_2017b11076_2017b11067;
public class Yaojing {
	private String name;
	private int age;
	private String gender;
	Yaojing(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	void showBasicInfo() {
		System.out.println("name:"+name+","+"age:"+age+","+"gender:"+gender);
	}
	void eatTangSeng() {
		System.out.println(name+"�����ɮ");
	}
}
class zhizhujing extends Yaojing {
	zhizhujing(String name,int age,String gender){
		super(name,age,gender);
	}
    void buildNet() {
    	System.out.println("�һ�֯��");
    }
}

class Baigujing extends Yaojing {
	Baigujing(String name,int age,String gender){
		super(name,age,gender);
	}
    void beBeauty() {
    	System.out.println("�����Ů��");
    }
}


	 
	 
	
	 

