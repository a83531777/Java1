package chapter4_2017b11092_2017b11076_2017b11067;

public abstract class Shape {
  abstract void area();
}

class Circle extends Shape{
	private double r;
	final double pi=3.14;
	Circle(double r){
		this.r=r;
	}
	void area() {
		double s=pi*r*r;
		System.out.println("圆的面积:"+s);
	}
}
class Square extends Shape{
	private double d;
	Square(double d){
		this.d=d;
	}
	void area() {
		double s=d*d;
		System.out.println("方形的面积:"+s);
	}
}
class Triangle extends Shape{
	private double d,h;
	Triangle(double d,double h){
		this.d=d;
		this.h=h;
	}
	void area() {
		double s=d*h/2;
		System.out.println("方形的面积:"+s);
	}
}