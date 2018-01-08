import java.util.*;
//implementing interface
interface Class1{
  int a=100;
  int b=1;
  public void add();
}
class Class2 implements Class1{
	public void add() {
		int c=a+b;
		System.out.println("sum is"+ c);
	}
}
public  class Intrface {
	public static void main(String args[]) {
	Class2 z=new Class2();
	z.add();
	}
}


