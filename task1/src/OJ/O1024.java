package OJ;

import java.util.Scanner;

public class O1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int a=0,b=0;
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String c=in.nextLine();
		int x=0;
		while(x<n) {
			s=in.nextLine();
			String[] s_=s.split(" ");
			int sum=0;
			for(int i=1;i<s_.length;i++) {
				sum=sum+Integer.valueOf(s_[i]);
			}
			System.out.println(sum);
			if(x!=n-1)System.out.println("");
			x++;
		}
	}
}
