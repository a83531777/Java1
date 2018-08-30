package OJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class O1005new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> al=new HashSet<String>();
		Scanner in=new Scanner(System.in);
		ArrayList<String> bl=new ArrayList<String>();
		while(in.hasNext()) {
			String a=in.next();
			if(a.equals("0"))break;
			al.add(a);
		}
		for(String s:al) {
			if(s.length()<2)continue;
			for(int i=1;i<=s.length()-1;i++) {
				String a=s.substring(0, i);
				String b=s.substring(i,s.length());
				if(al.contains(a)&&al.contains(b)) {
					bl.add(s);
					break;
				}
			}
		}
		Collections.sort(bl);
		for(String s:bl) {
			System.out.println(s);
		}
	}
}
