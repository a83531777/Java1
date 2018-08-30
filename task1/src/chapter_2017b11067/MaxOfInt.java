package chapter_2017b11067;

import java.util.Random;

public class MaxOfInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0,arr[]=new int[10];
		Random rand=new Random();
		for(int i=0;i<10;i++) {
			arr[i]=rand.nextInt(100);
			if(i==0)max=arr[i];
			else if(arr[i]>max)max=arr[i];
		}
		System.out.println(max);
	}
}
