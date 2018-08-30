package OJ;

public class O1068 {
	public static void main(String[] args) {
		int x=0,y=0,z=0;
		for(x=1;x<15;x++) {
			for(y=1;y<20;y++) {
				for(z=1;z<34;z++) {
					if(7*x+5*y+3*z==100)System.out.println(x+" "+y+" "+z);
					else if(7*x+5*y+3*z>100)break;
				}
			}
		}
	}

}
