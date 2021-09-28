package practice6;
import java.util.Scanner;
public class AddMul {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Number");
		int a=scan.nextInt();
		System.out.println("Enter Second Number");
		int b=scan.nextInt();
		System.out.println("Choose operation");
		scan.nextLine();
		String operator=scan.nextLine();
		String add="+";
		String mul="*";
		if(operator.equals(add))
		{
			int sum=add(a,b);
			System.out.println("The addition is " +sum);
		}
		else if(operator.equals(mul))
		{
			int product=mul(a,b);
			System.out.println("The product is " +product);
		}
		else System.out.println("Invalid");


		scan.close();

	}
	public static int  add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public static int mul(int a,int b)
	{
		int product=a*b;
		return product;
	}
}


