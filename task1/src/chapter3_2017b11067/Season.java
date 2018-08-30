package chapter3_2017b11067;

public class Season {
	int month;
	void show(){
		if(month>=3&&month<=5)System.out.println("´º¼¾");
		else if(month>=6&&month<=8)System.out.println("ÏÄ¼¾");
		else if(month>=9&&month<=11)System.out.println("Çï¼¾");
		else if(month==12||month<=2)System.out.println("¶¬¼¾");
	}
}
