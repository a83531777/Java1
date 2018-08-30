package Test;  

class F extends Exception{
	F(){
		
	}
	F(String m){
		super(m);
	}
}
public  class Car {
	Car(){};
		public static  void app(int[] arr,int i) throws F{
			if(i<0) {
			throw new F("i<0");
			}
		}
		public void ap() throws F {
			int[] a= {1,2,3};
			app(a,-1);
		}
		public static void main(String[] args)  {
			int[] a= {1,2,3};
			try {
				app(a,-1);
				
			} catch (F e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				
				
			}
		}
	}
