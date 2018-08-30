package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class No1 {

	public static void main(String[] args) {
        String a="1123";
        int[] n=new int[2];
        n[0]=1;
        n[1]=2;
        Pattern p=Pattern.compile("\\\\d{1,2}\\\\s*[+-]{1}\\\\s*\\\\d{1,2}");
        Matcher b=p.matcher(a);
        System.out.println(b.matches());
        System.out.println(a);
        if(b.matches()) {
        	String[] num=a.split("\\+");
        	n[0]=Integer.parseInt(num[0].trim());
        	n[1]=Integer.parseInt(num[1].trim());
        	System.out.println(num[0]+"\n"+num[1]);
        	System.out.println("true");
        }
        else System.out.println("0");
    }
}

