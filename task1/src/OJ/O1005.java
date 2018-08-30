package OJ;

import java.util.Scanner;

public class O1005 {
	public static void main(String[] args) {
		String[] en=new String[1000];
		String[] ans=new String[300];
		Scanner in=new Scanner(System.in);
		int i=0,y=0;
		while(in.hasNextLine()) {
			en[i]=in.nextLine();
			if(en[i].equals("0"))break;
			i++;
		}
		for(int a=0;a<i;a++) {
			if(en[a].length()==1)continue;
			for(int b=0;b<i;b++) {
				if(b==a||en[b].length()>=en[a].length())continue;
				for(int c=0;c<i;c++) {
					System.out.println(a+","+b+","+c);
					System.out.println(en[b]+en[c]+"  "+en[a]);
					if(c==b||c==a||(en[c].length()+en[b].length())>en[a].length())continue;
					if((en[c].length()+en[b].length())==en[c].length()){
						if(en[a].equals(en[b].concat(en[c]))||en[a].equals(en[b].concat(en[c]))) {
							ans[y]=en[c];
							y++;
						}
					}
				}
			}
		}
		for(int x=0;ans[x]!=null;x++) {
			System.out.println(ans[x]);
		}
	}

}
