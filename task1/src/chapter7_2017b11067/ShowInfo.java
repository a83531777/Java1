package chapter7_2017b11067;
import java.io.*;;
public class ShowInfo {
	public static void main(String[] args) {
		try {
			InputStream in=new FileInputStream(".//src/chapter7_2017b11067/ShowInfo.java");
			int n;
			while((n=in.read())!=-1) {
				System.out.print((char) n);
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

