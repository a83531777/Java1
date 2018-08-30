package chapter4_2017b11092_2017b11076_2017b11067;

public class YaojingTest {
	public static void main(String[] args) {
		Yaojing a=new Yaojing("熊大",1,"男");
		a.showBasicInfo();
		a.eatTangSeng();
		zhizhujing b=new zhizhujing("熊二",2,"男");
		b.showBasicInfo();
		b.eatTangSeng();
		b.buildNet();
		Baigujing c=new Baigujing("光头强",3,"男");
		c.showBasicInfo();
		c.eatTangSeng();
		c.beBeauty();
	}
}
