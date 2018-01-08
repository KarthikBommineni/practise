import java.util.*;
/*
 implementing exception handling with 1 try block and multiple catch block
 */
public class Exceptn{
public static void main(String args[]) {
	try{
	Scanner s=new Scanner(System.in);
	System.out.println("enter value of a");
	int a =s.nextInt();
	int b=23/a;
	System.out.println("b value is" + b);
	}
	catch(ArithmeticException z)
	{
	System.out.println(" enter non zero value");
	}
	catch(InputMismatchException ie)
	{
		System.out.println("enter integer value");
	}
}
}
