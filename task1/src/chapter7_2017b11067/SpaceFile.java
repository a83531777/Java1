package chapter7_2017b11067;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpaceFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		StringBuffer a=new StringBuffer(100);
		a.append(in.nextLine());
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ')a.replace(i, i+1,"@");
		}
		try {
			BufferedWriter br=new BufferedWriter(new FileWriter(".//src/chapter7_2017b11067/b.txt"));
			br.write(a.toString());
			br.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
