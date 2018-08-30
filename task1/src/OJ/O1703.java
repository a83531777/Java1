package OJ;

import java.util.Scanner;

public class O1703 {
	static int k=0;
	static int fac(int x) {
		if(x==0)return 1;
		double sum=0;
			for(int i=1;i<=x;i++) {
				sum=sum+Math.log10(i);
			}
			return ((int)sum)+1;
	}
	
	public static void main(String[] args) {
		// TODO A-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] num=new int[n];
		int[] ans=new int[n];
		int[] n_=new int[n];
		int i=0;
		for(;i<n;i++) {
			int x=in.nextInt();
			ans[i]=fac(x);
		}
		for(i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
	}
}
