import java.util.*;
class Exam1{
	int a,b,c;
	void add() {
		c=a+b;
		System.out.println("c is" + c);
	}
	/*int add(int a,int b) {
		c=a+b;
		System.out.println("c is" + c);
		return c;
	}
	*/
}
public class Objects {

	public static void main(String[] args) {
		Exam1 e= new Exam1();
		e.a=19;
		e.b=15;
		e.add();
	//	e.add(10,12);

	}

}
