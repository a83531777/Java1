package OJ;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O1067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a,a_,b,b_,c,c_,d,d_;
		String s;
		Pattern p=Pattern.compile("");
		Matcher m;
		while(in.hasNextLine()) {
			a=0;a_=0;b=0;b_=0;c=0;c_=0;d=0;d_=0;
			s=in.nextLine();
			for(int i=0;i<s.length();i++) {
				switch(s.charAt(i)) {
				case '(':a++;
				break;
				case ')':a_++;
				break;
				case '[':b++;
				break;
				case ']':b_++;
				break;
				case '{':c++;
				break;
				case '}':c_++;
				break;
				case '/':if(s.charAt(i-1)=='*')d++;
						 else d_++;
				break;
				default:break;
				}
			}
			if(a!=a_||b!=b_||c!=c_||d!=d_)System.out.println("error");
			else {
				m=p.matcher(s);
				if(m.matches())System.out.println("pass");
				else System.out.println("error");
			}
		}
	}

}

//"(" 和" )"、"[" 和 "]"、"{" 和 "}"、"/*" 和 "*/"