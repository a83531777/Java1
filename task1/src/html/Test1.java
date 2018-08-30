package html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uri="http://www.baidu.com";
		String str="";
		BufferedReader in=null;
		try {
			URL Url=new URL(uri);
			URLConnection con=Url.openConnection();
			con.connect();
			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String line;
	
			while((line=in.readLine())!=null) {
				str=str+line;
				//System.out.println(str);
			}
		}
		catch (Exception e) {
				  System.out.println("发送GET请求出现异常！" + e);
				  e.printStackTrace();
		}
		finally {
			if(in!=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		Pattern p=Pattern.compile("src=.*png");
		Matcher m=p.matcher(str);		
		if(m.find()) {
			System.out.println(m.group(0));
		}
		else System.out.println("nothing");
		
	}
}
