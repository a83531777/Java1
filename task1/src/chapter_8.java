
public class chapter_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a=new double[1000];
		for(int i=0;i<1000;i++) {
			a[i]=Math.random()*99990+10;
		}
		long t0=System.currentTimeMillis();
		for(int i=0;i<999;i++) {
			for(int j=0;j<999-i;j++) {
				if(a[j]>a[j+1]) {
					double temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		long t1=System.currentTimeMillis();
		System.out.println(t1-t0+"ms");
	}
}
