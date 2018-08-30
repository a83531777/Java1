package chapter3_2017b11067;

import java.util.Scanner;

public class TestGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.printf("请输入直角三角形的层数:");
		Graphic a=new Graphic();
		a.row=in.nextInt();
		System.out.printf("请输入显示的字符:");
		a.ch=in.next();
		a.printTriangle();
	}
}
