package mistake5;

public class Book {
	private String author;
	private String bookname;
	private int nopages;
	public Book(String auth,String name,int pages) {
		String author =auth;    //在构造方法中定义了局部变量，没有初始化属性
		String bookname = name;
		int nopages = pages;
	}
	public void print(){
		System.out.print("本书的作者是："+this.author);
		System.out.print("，书名是："+this.bookname);
		System.out.println(",共有"+this.nopages + "页。");
	}
	public static void main(String[] args) {
		Book bookObj = new Book("金庸","鹿鼎记",580);
		bookObj.print();
	}
}
