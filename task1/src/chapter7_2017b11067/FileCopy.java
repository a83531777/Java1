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
			String[] a= {"�����������","���᣺�㽭������","רҵ����17-3","ѧ�ţ�2017b11067"};
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
