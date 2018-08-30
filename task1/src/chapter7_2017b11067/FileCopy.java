package chapter7_2017b11067;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String b;
			String[] a= {"姓名：林振亨","籍贯：浙江温州人","专业：软工17-3","学号：2017b11067"};
			BufferedWriter bw1=new BufferedWriter(new FileWriter(".//src/chapter7_2017b11067/a.txt",true));
			int i=0;
			while(i<a.length) {
				bw1.write(a[i]);
				i++;
				bw1.newLine();
			}
			bw1.close();
			BufferedReader br1=new BufferedReader(new FileReader(".//src/chapter7_2017b11067/a.txt"));
			BufferedWriter bw2=new BufferedWriter(new FileWriter(".//src/chapter7_2017b11067/c.txt"));
			BufferedReader br2=new BufferedReader(new FileReader(".//src/chapter7_2017b11067/c.txt"));
			while((b=br1.readLine())!=null) {
				bw2.write(b);
				
				bw2.newLine();
			}
			br1.close();
			bw2.close();
			while((b=br2.readLine())!=null) {
				System.out.println(b);
			}
			br2.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
