package homework;

import java.util.ArrayList;
   class Student{
	   String name;
	   public boolean equals(Student a) {
		   if(this.name.equals(a.name))return true;
		   return false;
	   }
   }
public class Hw1 {
	public static void main(String args[]) {
		ArrayList<Student> a=new ArrayList<Student>();
		Student b=new Student();
		b.name="XXX";
		a.add(b);
		if(a.contains(b))System.out.println("°üº¬b");
	}
}
