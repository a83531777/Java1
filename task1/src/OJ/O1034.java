package OJ;

import java.util.Scanner;

public class O1034 {
//注意i和j的大小，及交换后i和j的输出
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,max=1,temp;
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt()) {
			temp=0;
			max=1;
			i=in.nextInt();
			j=in.nextInt();
			if(j<i) {
				temp=j;
				j=i;
				i=temp;
			}
			int a=i;
			for(;a<=j;a++) {
				n=1;
				for(int k=a;;n++) {
					if(k==1)break;
					if(k%2==0)k=k/2;
					else k=k*3+1;
				}
				if(n>max)max=n;
			}
			if(temp==0)System.out.println(i+" "+j+" "+max);
			else System.out.println(j+" "+i+" "+max);
		}
	}
}
