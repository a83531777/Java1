package homework;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Hw2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<String,String> a=new HashMap<String,String>();
		a.put("�㽭ʡ*"	,"����");
		a.put("�Ϻ�ʡ","�Ϻ�");
		a.put("����ʡ*","����");
		a.put("�ӱ�ʡ*","ʯ��ׯ");
		a.put("�Ĵ�ʡ","�ɶ�");
		Set<String> b=a.keySet();
		Iterator c= b.iterator();
		while(c.hasNext()) {
			String s=(String) c.next();
			if(s.contains("*"))
			System.out.println(a.get(s));
		}
		FileOutputStream cd=new FileOutputStream("d://cd.txt");
		cd.write(123);
	}
}
