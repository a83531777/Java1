package OJ;

import java.util.Scanner;

public class O1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double[] ans=new double[10000];
		int[] num=new int[10000];
		int i;
		double min=0;
		for(i=0;;i++) {
			int k=0;
			num[i]=in.nextInt();
			if(num[i]==0)break;
			else if(num[i]<=4)ans[i]=10;
			else if(num[i]>4&&num[i]<=8)ans[i]=10+(num[i]-4)*2;
			else {
				int s=num[i]/8,left=num[i]%8;
				if(left==0) {
					ans[i]=18*s;
				}
				else if(0<left&&left<=4) {
					ans[i]=s*18+left*2.4;
				}
				else ans[i]=18*s+10+2*(left-4);
		}
	}
		for(int k=0;k<i;k++) {
			int c=(int) ans[k];
			if(c==ans[k])System.out.println(c);
			else System.out.printf("%.1f\n",ans[k]);
		}
}
}
