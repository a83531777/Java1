package chapter_2017b11067;

import java.util.Scanner;

public class Running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fight;
		Scanner in=new Scanner(System.in);
		fight=in.nextInt();
		if(fight>=90)System.out.println("�ܹ���������");
		else if(fight>=80)System.out.println("�ܹ������˽�");
		else if(fight>=70)System.out.println("�ܹ����ɳɮ");
		else if(fight>=60)System.out.println("�ܹ������ɮ");
		else System.out.println("�㻹δ���డ��");
	
		

	}

}
