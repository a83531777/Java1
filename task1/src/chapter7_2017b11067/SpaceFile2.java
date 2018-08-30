package chapter7_2017b11067;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class SpaceFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DataOutputStream br=new DataOutputStream(new FileOutputStream(".//src/chapter7_2017b11067/c.txt"));
			Scanner in=new Scanner(System.in);
			String str=in.next();
			char[] a=str.toCharArray();
			Arrays.sort(a);
			br.writeChars(new String(a));
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
