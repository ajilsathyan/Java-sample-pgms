package sample;
import java.util.Scanner;

public class multiplication {
	public static void main(String arg[]) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		
		int num1= reader.nextInt();
		int num2= reader.nextInt();
		int result=num1*num2;
		
		if(num1!=0) {
			if(num2!=0) {
				
				System.out.println("Resuslt is "+ result);
			}
			else if(num2==0) {
				System.out.println("Please enter the Second number is greater than Zero");
			}
		}
		
		else if (num1==0){
			if(num2==0) {
				
				System.out.println("Please enter  2 Valid Numbers in order to execute");
			}
			else {
				System.out.println("Please enter  the first number is greater than Zero");
			}
		} 
	}
	

}
