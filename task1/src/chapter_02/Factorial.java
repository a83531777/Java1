package chapter_02;

import java.util.Scanner;

public class Factorial {
	
	public static int Cal(int n,int ans){
		int x=1;
		if(n==1) {
			ans=ans+1;
			return ans;
		}
		else {
			for(int i=2;i<=n;i++) {
				x=x*i;
			}
			ans=ans+x;
			ans=Cal(n-1,ans);
		}
		return ans;
	}			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ans=0;
		ans=Cal(n,ans);
		System.out.println(ans);
	}

}
