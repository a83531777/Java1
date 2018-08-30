package hOJ;

import java.util.Scanner;

public class O1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,max;
		Scanner in=new Scanner(System.in);
		while(true){
			max=0;
			n=in.nextInt();
			if(n==0)break;
			String[] s=new String[n];
			for(int i=0;i<n;i++) {
				s[i]=in.next();
			}
			int[] num=new int[n];
			for(int i=0;i<n;i++) {
				num[i]=0;
				for(int j=i+1;j<n;j++) {
					if(s[i].equals(s[j]))num[i]++;
				}
				if(i!=0) {
					if(num[i]>num[i-1])max=i;
				}
			}
			System.out.println(s[max]);
		}
	}
}
