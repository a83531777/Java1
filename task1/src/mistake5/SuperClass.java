package mistake5;

abstract class SuperClass{
/*02*/		public abstract void init(){
/*03*/			System.out.println("super");  
/*04*/		}
/*05*/
/*06*/		public final void print(){
/*07*/			System.out.println("This is the super");
/*08*/		}
/*09*/		abstract void report();
/*10*/	}
/*11*/	 class CorrectErrors extends SuperClass{
/*12*/		public final void print(){
/*13*/			System.out.println("This is the subclass"); 
/*14*/		}
/*15*/		public void report(){
/*16*/			System.out.println("We must correct errors.");	
/*17*/		}
/*18*/		public static void main(String[] args) {
/*19*/			SuperClass superObj = new SuperClass(); 
/*20*/			superObj.print();
/*21*/		
/*22*/			CorrectErrors subObj = new CorrectErrors();
/*23*/			subObj.report();
/*24*/		}
/*25*/	}
