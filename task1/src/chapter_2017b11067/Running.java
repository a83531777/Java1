package chapter_2017b11067;

import java.util.Scanner;

public class Running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fight;
		Scanner in=new Scanner(System.in);
		fight=in.nextInt();
		if(fight>=90)System.out.println("能够打败孙悟空");
		else if(fight>=80)System.out.println("能够打败猪八戒");
		else if(fight>=70)System.out.println("能够打败沙僧");
		else if(fight>=60)System.out.println("能够打败唐僧");
		else System.out.println("你还未够班啊！");
	
		

	}

}
