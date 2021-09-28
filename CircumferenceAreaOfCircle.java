package practice6;
import java.util.Scanner;
public class CircumferenceAreaOfCircle {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius of a circle ");
		int r=scan.nextInt();
		float pi=3.14f;
		area(r,pi);
		circumference(r,pi);
	 scan.close();
	}
	
	 public static void area(int r,float pi) {
		 float a=pi*r*r;
		 System.out.println("Area of a circle is " +a );
	 }
	 public static void circumference(int r,float pi) {
		 float a=2*pi*r;
		 System.out.println("Circumference of a circle is " +a);
	 }
	 
 }
	
	


