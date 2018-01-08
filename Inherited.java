import java.util.*;
/*implementing inheritance by single inheritance
 using extends keyword
 inherits--subclass
 inherited--superclass
 */
class Inherits{
	int odi=1456;
	int test=1423;
}
public class Inherited  extends Inherits{
	public static void main(String[] args) {
		Inherited score=new Inherited();
		System.out.println("Score in odi is"+ score.odi);
        System.out.println("score in tests is:"+ score.test);
	}

}
