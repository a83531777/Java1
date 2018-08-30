package trick;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Windows/System32/drivers/etc/hosts",true));
			bw.newLine();
			bw.write("127.0.0.1 www.baidu.com");
			bw.flush();
			System.out.println("Try Baidu");
			System.out.println("Can't open?that's it");
			System.out.println("do u wanna free it\n tell me you are 2B in Chinese");
			String ans=in.next();
			if(ans.equals("Œ“ «2B")) {
			BufferedReader br=new BufferedReader(new FileReader("C:/Windows/System32/drivers/etc/hosts"));
			String[] b=new String[1024];
			int i=0;
			while((b[i]=br.readLine())!=null) {
				if(b[i].equals("127.0.0.1 www.baidu.com")==false) {
					i++;
				}
			}
			br.close();
			BufferedWriter bw2=new BufferedWriter(new FileWriter("C:/Windows/System32/drivers/etc/hosts"));
			for(int c=0;c<i;c++) {
				bw2.write(b[c]);
				bw2.newLine();
			}
			bw2.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
