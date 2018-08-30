package chapter3_2017b11067;

import java.util.Scanner;

public class TestCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate x=new Calculate();
		Scanner in=new Scanner(System.in);
		System.out.printf("put in the mode:");
		switch(in.next()) {
		case "add":{
			System.out.println(x.add(in.nextDouble(),in.nextDouble()));
			break;
		}
		case "dec":{
			System.out.println(x.dec(in.nextDouble(),in.nextDouble()));
			break;
		}
		case "mul":{
			System.out.println(x.mul(in.nextDouble(),in.nextDouble()));
			break;
		}
		}
	}
}
