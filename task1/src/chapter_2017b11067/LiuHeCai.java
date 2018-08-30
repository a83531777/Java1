package chapter_2017b11067;

import java.util.Scanner;

public class LiuHeCai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个二位数:");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt(),rand=(int)(Math.random()*900000+100000);
		if(i==rand%100)System.out.println("恭喜您，林振亨，中了三等奖，中奖号码为"+rand);
		else System.out.println("林振亨，别灰心，希望下次好运！");
		
	}

}
