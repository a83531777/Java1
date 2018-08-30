package OJ;

import java.math.BigInteger;
import java.util.Scanner;

public class O1057 {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			BigInteger[][] a = new BigInteger[n][2] ; 
			for(int i=0,k=0;i<n;i++) {
				a[i][k]=in.nextBigInteger();
				a[i][k+1]=in.nextBigInteger();
			}
			for(int i=0,k=0;i<n;i++) {
				System.out.println("Case "+(i+1)+":");
				System.out.println(a[i][k]+" * "+a[i][k+1]+" = "+a[i][k].multiply(a[i][k+1]));
				System.out.printf("\n");
			}
		}
}
