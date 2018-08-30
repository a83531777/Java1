package chapter3_2017b11067;

import java.util.Scanner;

public class TestQQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QQ wo =new QQ();
		Scanner in=new Scanner(System.in);
		System.out.println("put in you name");
		wo.name=in.next();
		System.out.println("put in you ID");
		wo.ID=in.next();
		System.out.println("put in you password");
		wo.password=in.next();
		System.out.println("put in you information");
		wo.information=in.next();
		wo.showInfo(); 
		
	}
}
