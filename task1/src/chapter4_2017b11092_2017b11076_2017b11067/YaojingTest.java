package chapter4_2017b11092_2017b11076_2017b11067;

public class YaojingTest {
	public static void main(String[] args) {
		Yaojing a=new Yaojing("�ܴ�",1,"��");
		a.showBasicInfo();
		a.eatTangSeng();
		zhizhujing b=new zhizhujing("�ܶ�",2,"��");
		b.showBasicInfo();
		b.eatTangSeng();
		b.buildNet();
		Baigujing c=new Baigujing("��ͷǿ",3,"��");
		c.showBasicInfo();
		c.eatTangSeng();
		c.beBeauty();
	}
}
