class ParentClas{
   //Parent class constructor
   ParentClas(){
	System.out.println("Constructor of Parent");
   }
   void disp(){
	System.out.println("Parent Method");
   }
}
public class JavaExample1 extends ParentClas {
	JavaExample1(){
		System.out.println("Constructor of Child");
	   }
	   void disp(){
		  
		System.out.println("Child Method");
	        //Calling the disp() method of parent class
		 super.disp();
	   }
	   public static void main(String args[]){
		//Creating the object of child class
		JavaExample1 obj = new JavaExample1();
		obj.disp();
	   }

}
