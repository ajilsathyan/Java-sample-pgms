
public class DEF extends ABC {
   
	
	int a=10;
	
	DEF(){
		
		System.out.println("It's Contructor DEF");
	}
	
	DEF(int a){
		super(10);
		System.out.println("It's Constructor Argument of DEF");
	}
	
	void display(){
		
		System.out.println("It's DEF");
		
		super.a=30;
		
		int c=a+super.a;
		System.out.println(c);
		
		
	}
	void basedisplay() {
		super.display();
	}
	
	
	public static void main(String[] args) {
		
		DEF a=new DEF(10);
		a.display();
		a.basedisplay();
		
		
	}
	
	
	
	
	
	
	
}
