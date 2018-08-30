package chapter3_2017b11067;

public class Car {
	String color; 
	String brand; 
	String type; 
	String note;
	float price; 
	int year; 
	public void showInfo(){
		System.out.println("品牌：" + brand);
		System.out.println("颜色：" + color);
		System.out.println("类型" + type);
		System.out.println("价格" + price);
		System.out.println("年份：" + year);
		System.out.println("备注：" + note);
		}
	public void setNote(String newNote){
		note = newNote;
		}
}
