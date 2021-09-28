package practice6;
import java.util.Scanner;
public class EligibleForVote {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age of a person");
		int age=scan.nextInt();
		boolean flag=validateAge(age);
		if(flag==true) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not Eligible for vote");
		}
		scan.close();
	}
	
	
	public static boolean validateAge(int age) {
		if(age>=18) {
          return true;
		}
		else {
		return false;
	}
		
  }

}
