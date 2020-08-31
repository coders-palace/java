package Java_programs;

import java.util.Scanner;
public class ExceptionExp {

	public void calculate(int a,int b)
	{
		try{
			int r;
			r=a/b;
			System.out.println("The quotient is "+r);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend for division :");
		int dividend=sc.nextInt();
		System.out.println("Enter divisor for division :");
		int divisor=sc.nextInt();
		ExceptionExp ex=new ExceptionExp();
		ex.calculate(dividend,divisor);

	}

}
