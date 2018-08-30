package chapter_2017b11067;

import java.util.Scanner;

public class Main1032 {
	public static void main(String[] args) {
		String a;
		char b;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		for(int i=a.length()-1;i>=0;i--) {
			b=a.charAt(i);
			System.out.printf("%c",b);
		}
		
		
		
	}

}
