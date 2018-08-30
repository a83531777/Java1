package OJ;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class O1700 {

	public static void main(String[] args) {
		// TODO Auto-generated method st	
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Scanner a1=new Scanner(System.in);
		String[] a=new String[n];
		String[] ans=new String[n];
		int[] num_=new int[2];
		String fr=in.nextLine();
		Pattern p=Pattern.compile("\\s*\\d{1,2}\\s*[+-]{1}\\s*\\d{1,2}\\s*");
		Matcher b;
		for(int i=0;i<n;i++) {
			a[i]=in.nextLine();
			b=p.matcher(a[i]);
			if(b.matches()) {
				String[] num=a[i].split("\\+|-");
				for(int k=0;k<2;k++) {
					num_[k]=Integer.parseInt(num[k].trim());
				}
				if(a[i].indexOf("+")>0) {
					if(num_[0]+num_[1]>=100)ans[i]="ERROR";
					else ans[i]=String.valueOf(num_[0]+num_[1]);
				}
				else {
					if(num_[0]-num_[1]<0)ans[i]="ERROR";
					else ans[i]=String.valueOf(num_[0]-num_[1]);
				}
			}
			else ans[i]="ERROR";
		}
		in.close();
		a1.close();
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
}
}
