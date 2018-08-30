package OJ;

import java.util.Scanner;

public class O1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,n=1;
		String s;
		int num;
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt()) {
			x=in.nextInt();
			y=in.nextInt();
			if(x==0&&y==0)break;
			char[][] c=new char[x][y];
			String[][] ans=new String[x][y];
			for(int a=0;a<x;a++) {
				s=in.next();
				for(int b=0;b<y;b++) {
					c[a][b]=s.charAt(b);
				}
			}
			for(int a=0;a<x;a++) {
				num=0;
				if(x==1) {
					for(int b=0;b<y;b++) {
						num=0;
						if(c[a][b]=='*')ans[a][b]="*";
						else {
							if(b==0) {
								if(c[a][b+1]=='*')num++;
							}
							else if(b==y-1) {
								if(c[a][b-1]=='*')num++;
							}
							else {
								if(c[a][b-1]=='*')num++;
								if(c[a][b+1]=='*')num++;
							}
						}
						if(!ans[a][b].equals("*"))ans[a][b]=String.valueOf(num);
					}
					break;
				}
				else if(y==1) {
					for(int b=0;a<x;a++) {
						num=0;
						if(c[a][b]=='*')ans[a][b]="*";
						else {
							if(a==0) {
								if(c[a+1][b]=='*')num++;
							}
							else if(a==x-1) {
								if(c[a-1][b]=='*')num++;
							}
							else {
								if(c[a-1][b]=='*')num++;
								if(c[a+1][b]=='*')num++;
							}
						}
						if(!ans[a][b].equals("*"))ans[a][b]=String.valueOf(num);
					}
					break;
				}
				else {
					for(int b=0;b<y;b++) {
						num=0;
						if(c[a][b]=='*') {
							ans[a][b]="*";
							continue;
						}
						else {
							if(a==0) {
								if(b==0) {
									if(c[a][b+1]=='*')num++;
									if(c[a+1][b]=='*')num++;
									if(c[a+1][b+1]=='*')num++;
									ans[a][b]=String.valueOf(num);
									continue;
								}
								if(b==y-1) {
									if(c[a+1][b]=='*')num++;
									if(c[a+1][b-1]=='*')num++;
									if(c[a][b-1]=='*')num++;
									ans[a][b]=String.valueOf(num);
									continue;
								}
								else {
									if(c[a][b-1]=='*')num++;
									if(c[a][b+1]=='*')num++;
									if(c[a+1][b]=='*')num++;
									if(c[a+1][b-1]=='*')num++;
									if(c[a+1][b+1]=='*')num++;
									ans[a][b]=String.valueOf(num);
									continue;
								}
							}
							if(a==x-1) {
								if(b==0) {
									if(c[a][b+1]=='*')num++;
									if(c[a-1][b]=='*')num++;
									if(c[a-1][b+1]=='*')num++;
									ans[a][b]=String.valueOf(num);
									continue;
								}
								if(b==y-1) {
									if(c[a][b-1]=='*')num++;
									if(c[a-1][b-1]=='*')num++;
									if(c[a-1][b]=='*')num++;
									ans[a][b]=String.valueOf(num);
									continue;
								}
								else {
									if(c[a][b-1]=='*')num++;
									if(c[a][b+1]=='*')num++;
									if(c[a-1][b-1]=='*')num++;
									if(c[a-1][b]=='*')num++;
									if(c[a-1][b+1]=='*')num++;
									ans[a][b]=String.valueOf(num);
									continue;
								}
							}
							else {
								if(b==0) {
									if(c[a][b+1]=='*')num++;
									if(c[a-1][b+1]=='*')num++;
									if(c[a-1][b]=='*')num++;
									if(c[a+1][b+1]=='*')num++;
									if(c[a+1][b]=='*')num++;
								}
								else if(b==y-1) {
									if(c[a][b-1]=='*')num++;
									if(c[a-1][b-1]=='*')num++;
									if(c[a+1][b-1]=='*')num++;
									if(c[a-1][b]=='*')num++;
									if(c[a+1][b]=='*')num++;
								}
								else {
									if(c[a][b-1]=='*')num++;
									if(c[a-1][b-1]=='*')num++;
									if(c[a+1][b-1]=='*')num++;
									if(c[a][b+1]=='*')num++;
									if(c[a-1][b+1]=='*')num++;
									if(c[a-1][b]=='*')num++;
									if(c[a+1][b+1]=='*')num++;
									if(c[a+1][b]=='*')num++;
								}
								ans[a][b]=String.valueOf(num);
								continue;
							}
						}
					}
				}
			}
			if(n!=1)System.out.println("");
			System.out.println("Field #"+n+":");
			n++;
			for(int a=0;a<x;a++) {
				for(int b=0;b<y;b++) {
					System.out.print(ans[a][b]);
					if(b==y-1) {
						break;
					}
				}
				System.out.println("");
			}
		}
	}
}