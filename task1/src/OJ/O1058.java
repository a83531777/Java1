package OJ;

import java.util.Arrays;
import java.util.Scanner;

public class O1058 {
	static int[] n=new int[10000];
	static int max=0,x=0;
	public static int start(int i,int s1,int o) {
		System.out.printf("%d %d %d %d %d\n",i,o,n[i],n[o],s1);
		if(n[i]<n[o])return 0;
		if(i>=x-1) {
			if(s1==1||i>x-1)return 0;
			else if(s1>max) {
				max=s1;
				return 0;
			}
		}
		for(int j=i+1;j<x;j++) {
			if(n[j]>n[i]) start(j,s1+1,i);
		}
		start(i+1,s1,i);
		return 0;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int[] ans=new int[20];
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt()) {
			Arrays.fill(n,0);
			max=0;
			x=in.nextInt();
			if(x==0)break;
			for(int i=0;i<x;i++) {
				n[i]=in.nextInt();
			}
			start(0,1,0);
			ans[k]=max;
			k++;
			}
		for(int i:ans) {
			if(i==0)return;
			System.out.println(i);
		}
	}

}