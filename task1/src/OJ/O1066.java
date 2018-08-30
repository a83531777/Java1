package OJ;

import java.math.BigInteger;
import java.util.Scanner;

public class O1066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger k,N,m,l,b,c=new BigInteger("1"),d=new BigInteger("0");
		Scanner in=new Scanner(System.in);
		while(in.hasNextBigInteger()) {
			k=in.nextBigInteger();
			N=in.nextBigInteger();
			m=in.nextBigInteger();
			l=N.subtract(k);
			BigInteger[] a=l.divideAndRemainder(m);
			if(a[1].equals(d)&&!l.equals(d))System.out.println(a[0]);
			else System.out.println(a[0].add(c));
		}
		System.out.println("");
	}
}

