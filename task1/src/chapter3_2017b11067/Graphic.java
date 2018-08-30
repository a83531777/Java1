package chapter3_2017b11067;

public class Graphic {
	int row;
	String ch;
	void printTriangle() {
		for(int i=0;i<row;i++) {
			for(int j=1;j<=1+2*i;j++) {
				System.out.printf("%s",ch);
				if(j==1+2*i)System.out.printf("\n");
			}
		}
	}
}
