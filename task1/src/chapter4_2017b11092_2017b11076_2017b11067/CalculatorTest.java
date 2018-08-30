package chapter4_2017b11092_2017b11076_2017b11067;

import java.util.Scanner;

public class CalculatorTest extends Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("put in two num");
		System.out.println(new Calculator().add(in.nextInt(),in.nextInt()));
		System.out.println("put in two String");
		System.out.println(new Calculator().add(in.next(),in.next()));
		new Calculator().add();
	}
}
