package OJ;

import java.util.Arrays;
import java.util.Scanner;

public class O1003Test {
	static int i2=0;
	static long[] ans=new long[50];
	static long num;
	public static int Fac(long x) {
		if(x==2||x==3) {
			ans[i2]=x;
			i2++;
			return 0;
		}
		if(x==1)return 0;
		long c=x;
		for(int z=2;z<=(int) Math.sqrt(x);z++) {
			if(c%z==0&&x/z!=1) {
				Fac(z);
				Fac(c/z);
				break;
			}
			else if(x/z==1) {
				ans[i2]=x;
				i2++;
				return 0;
			}
			else if(z==(int) Math.sqrt(x)){
				ans[i2]=x;
				i2++;
			}
		}
		return 0;
	}
	

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		while(true) {
			num=in.nextLong();
			if(num==-1)break;
			for(int i=0;i<50;i++) {
				ans[i]=0;
			}
			i2=0;
			Fac(num);
			Arrays.sort(ans);
			
			for(int i=0;i<50;i++) {
				if(ans[i]==0)continue;
				System.out.println("    "+ans[i]);
			}
			System.out.printf("\n");
		}
	}
}
