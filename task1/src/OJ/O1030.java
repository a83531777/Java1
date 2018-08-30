package OJ;

import java.util.Scanner;

public class O1030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int a=0,b=0,c=0;
		Scanner in=new Scanner(System.in);
		while(in.hasNextLine()) {
			if(c!=0)System.out.println("");
			s=in.nextLine();
			String[] s_=s.split(" ");
			a=Integer.valueOf(s_[0]);
			b=Integer.valueOf(s_[1]);
			System.out.println(a+b);
			c++;
		}
	}
}
