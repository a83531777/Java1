package chapter_03;

public class Student {
	private int ID,Math,Chinese,English;
	private String name,sex,leader;
	public void setID(int iD) {
		ID = iD;
	}
	public int setMath(int math) {
		Math = math;
		return Math;
	}
	public int setChinese(int chinese) {
		Chinese = chinese;
		return Chinese;
	}
	public int setEnglish(int english) {
		English = english;
		return English;
	}
	public String setName(String name) {
		this.name = name;
		return this.name;
	}
	public String setSex(String sex) {
		this.sex = sex;
		return this.sex;
	}
	public String setLeader(String leader) {
		this.leader = leader;
		return this.leader;
	}
	public int sum() {
		return Chinese+Math+English;
	}
	public double _sum() {
		return (Chinese+Math+English)/3;
	}
}
