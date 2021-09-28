package practice6;
import java.util.Scanner;
public class Method {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		int add = (a+b);
		System.out.println("Addition of two numbers is :" + add) ;
        int multiply=(a*b);
        System.out.println("Multiplication of two numbers is :" + multiply) ;
        scan.close();
        }
	
	
	
	public static int add(int a,int b) {
		return a+b;
	}
		
		public static int multiply(int a,int b) {
			return a*b;
		}
		
	}
	

		
		


