package chapter3_2017b11067;

public class Car {
	String color; 
	String brand; 
	String type; 
	String note;
	float price; 
	int year; 
	public void showInfo(){
		System.out.println("Ʒ�ƣ�" + brand);
		System.out.println("��ɫ��" + color);
		System.out.println("����" + type);
		System.out.println("�۸�" + price);
		System.out.println("��ݣ�" + year);
		System.out.println("��ע��" + note);
		}
	public void setNote(String newNote){
		note = newNote;
		}
}
