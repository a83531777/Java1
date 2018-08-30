package OJ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O1087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;	
		Scanner in=new Scanner(System.in);
		Pattern s=Pattern.compile("^[2][0-5][0-5]$|^[1][0-9][0-9]$|^[1-9][0-5]$|^[0-9]$");
		Matcher b;
		while(in.hasNext()) {
			a=in.next();
			if(a.equals("End of file"))break;
			String[] x=a.split("\\.");
			if(x.length<4)System.out.println("N");
			else {
				for(int i=0;i<4;i++) {
					b=s.matcher(x[i]);
					if(!b.matches()) {
						System.out.println("N");
						break;
					}
					else if(i==3)System.out.println("Y");
				}
			}
		}
		in.close();
	}
}
