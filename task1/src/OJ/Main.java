package OJ;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long  x=0,ans=0,k=0;
		Scanner in=new Scanner(System.in);
		while(true) {
			k=in.nextLong();
			if(k==-1)break;
			else if(x==0)ans=k;
			else if(ans<k)ans=k;
			x++;
		}
		System.out.println(ans);
	}

}
