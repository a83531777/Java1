package mistake5;

public class Book {
	private String author;
	private String bookname;
	private int nopages;
	public Book(String auth,String name,int pages) {
		String author =auth;    //�ڹ��췽���ж����˾ֲ�������û�г�ʼ������
		String bookname = name;
		int nopages = pages;
	}
	public void print(){
		System.out.print("����������ǣ�"+this.author);
		System.out.print("�������ǣ�"+this.bookname);
		System.out.println(",����"+this.nopages + "ҳ��");
	}
	public static void main(String[] args) {
		Book bookObj = new Book("��ӹ","¹����",580);
		bookObj.print();
	}
}
