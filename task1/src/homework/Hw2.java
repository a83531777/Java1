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
		a.put("浙江省*"	,"杭州");
		a.put("上海省","上海");
		a.put("北京省*","北京");
		a.put("河北省*","石家庄");
		a.put("四川省","成都");
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
