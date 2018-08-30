package OJ;

import java.util.Scanner;

public class O1066new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k,N,m,l,n,ans;
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt()) {
			n=0;
			k=in.nextInt();
			N=in.nextInt();
			m=in.nextInt();
			l=N-k;
			if(l%m==0)ans=l/m;
			else ans=l/m+1;;
			for(int i=k;i<N;i=i+m) {
				n++;
			}
			System.out.println(ans+","+n);
		}
	}
}
