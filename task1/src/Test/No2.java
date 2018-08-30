package Test;

import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class No2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String a="123";
		boolean ad=true;
		if(ad==true)System.out.println("bingo");
		double[] limits = { 3,  ChoiceFormat.previousDouble(4),5 };
		String[] formats = { "星期一", "星期二", "星期三" };
		ChoiceFormat format = new ChoiceFormat(limits, formats);
		System.out.println(format.format(5));
		System.out.println(-5%2);
		
		
		
	}
}
