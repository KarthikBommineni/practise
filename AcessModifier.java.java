
public class AcessModifier {

		public static void main(String[] args){  
			Student s=new Student();  
			s.setName("vijay");  
			System.out.println(s.getName());  
			}  
			
	}
	class Student{  
	private String name;  
	   
	public String getName(){  
	return name;  
	}  
	public void setName(String name){  
	this.name=name ; 
	}  
}  

