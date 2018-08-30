package chapter3_2017b11067;

import java.util.Scanner;

public class TestSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.printf("ÇëÊäÈëÔÂ·İ:");
		Season a=new Season();
		a.month=in.nextInt();
		a.show();
	}
}
