import java.util.*;
/* implementing polymorphism;
  method overriding occurs
  
 */
class Adt{
	static int mul1(int a,int b,int c) {
		return (a*b*c);
	}
	static int mul2(int a,int b,int c) {
		return (a+b+c);
	}
}
public class Poly {
  public static void main(String[] args) {
	  System.out.println("result is:"+ Adt.mul2(12,12,11));//mul2 overrides mul1
		System.out.println("result is:"+ Adt.mul2(12,12,13));

	}

}