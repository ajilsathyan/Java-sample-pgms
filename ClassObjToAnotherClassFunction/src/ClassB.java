
public class ClassB {
	
	
	void display() {
		
		System.out.println("Hello!!!");
	}
	
	
public static void main(String[] args) {
	ClassB obj=new ClassB();
	ClassA a=new ClassA();
	a.display(obj);
	
	
   }
}
