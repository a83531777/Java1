package chapter_2017b11067;

import java.util.Scanner;

public class LiuHeCai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ����λ��:");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt(),rand=(int)(Math.random()*900000+100000);
		if(i==rand%100)System.out.println("��ϲ��������࣬�������Ƚ����н�����Ϊ"+rand);
		else System.out.println("����࣬����ģ�ϣ���´κ��ˣ�");
		
	}

}
