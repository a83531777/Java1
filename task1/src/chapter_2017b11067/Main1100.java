package chapter_2017b11067;


import java.util.Arrays;
import java.util.Scanner;

public class Main1100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[4];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for(int i:a) {
			System.out.printf("%d ",i);
		}

	}

}
