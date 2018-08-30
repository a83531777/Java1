package chapter3_2017b11067;

import java.util.Scanner;

public class O1061 {

	public static void main(String[] args)  {
		Scanner in=new Scanner(System.in);
		StringBuffer str=new StringBuffer(101);
		while(in.hasNext()) {
			str.append(in.next());
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>='a'&&str.charAt(i)<='c')str.replace(i,i+1, "2");
				else if(str.charAt(i)>='d'&&str.charAt(i)<='f')str.replace(i,i+1, "3");
				else if(str.charAt(i)>='g'&&str.charAt(i)<='i')str.replace(i,i+1, "4");
				else if(str.charAt(i)>='j'&&str.charAt(i)<='l')str.replace(i,i+1, "5");
				else if(str.charAt(i)>='m'&&str.charAt(i)<='o')str.replace(i,i+1, "6");
				else if(str.charAt(i)>='p'&&str.charAt(i)<='s')str.replace(i,i+1, "7");
				else if(str.charAt(i)>='t'&&str.charAt(i)<='v')str.replace(i,i+1, "8");
				else if(str.charAt(i)>='w'&&str.charAt(i)<='z')str.replace(i,i+1, "9");
				else if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
					if(str.charAt(i)=='Z')str.replace(i,i+1, "a");
					else {
						char a=str.charAt(i);
						a=(char) (a+33);
						 str.replace(i,i+1, String.valueOf(a));
					}
				}
			}
			System.out.println(str);
		}
	}
}
