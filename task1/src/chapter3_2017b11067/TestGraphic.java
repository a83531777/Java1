package chapter3_2017b11067;

import java.util.Scanner;

public class TestGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.printf("������ֱ�������εĲ���:");
		Graphic a=new Graphic();
		a.row=in.nextInt();
		System.out.printf("��������ʾ���ַ�:");
		a.ch=in.next();
		a.printTriangle();
	}
}
