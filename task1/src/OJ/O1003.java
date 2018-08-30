package OJ;

import java.util.Scanner;

public class O1003 {
	static int i2=0;
	static long[][] ans=new long[20][50];
	static long[] num=new long[20];
	public static int Fac(long x,int y) {
		if(x==2||x==3) {
			ans[y][i2]=x;
			i2++;
			return 0;
		}
		if(x==1)return 0;
		long c=x;
		for(int z=2,j=0;z<=(int)Math.sqrt(x);z++) {
			if(c%z==0&&x/z!=1) {
				Fac(z,y);
				Fac(c/z,y);
				break;
			}
			else if(x/z==1) {
				ans[y][i2]=x;
				i2++;
				return 0;
			}
			else if(z==(int)Math.sqrt(x)){
				ans[y][i2]=x;
				i2++;
			}
		}
		return 0;
	}
	

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int i=0;
		long temp=0;
		while(in.hasNextLong()) {
			for(int a=0;a<50;a++) {
				ans[i][a]=0;
			}
			i2=0;
			num[i]=in.nextLong();
			if(num[i]==-1)break;
			Fac(num[i],i);
			
			for(int a=0;a<i2-2;a++) {
				for(int b=a+1;b<i2-1;b++) {
					if(ans[i][a]>ans[i][b]) {
						temp=ans[i][a];
						ans[i][a]=ans[i][b];
						ans[i][b]=temp;
					}
				}
			}
			i++;
		}
		for(int x=0;x<i;x++) {
			for(int y=0;y<50;y++) {
				if(ans[x][y]==0) {System.out.printf("\n");
				break;}
				System.out.println("    "+ans[x][y]);
			}
			
		}
		
	}

}
