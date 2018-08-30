package OJ;

import java.util.Scanner;

public class O1105_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[30000];
		String[] ans=new String[300];
		String[] s=new String[2];
		Scanner in=new Scanner(System.in);
		int s_=0;
		int z=0;
		while(in.hasNextLine()) {
			str[s_]=in.nextLine();
			if(str[s_].equals("0"))break;
			s_++;
		}
		for(int i=0;i<s_;i++) {
			for(int x=1;x<str[i].length();x++) {
				if(str[i].length()==0)break;
				s[0]=str[i].substring(0,x);
				s[1]=str[i].substring(x,str[i].length());
				for(int a=0;a<s_;a++) {
					if(a==i)continue;
					if(s[0].equals(str[a])) {
						for(int b=0;b<s_;b++) {
							if(b==a||b==i)continue;
							if(s[1].equals(str[b])) {
								ans[z]=str[i];
								z++;
							}
						}
						break;
					}
				}
			}
		}
		for(int i=0;i<z;i++) {
			System.out.println(ans[i]);
		}
	}
}
