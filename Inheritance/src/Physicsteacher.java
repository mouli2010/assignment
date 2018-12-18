 class Teacher
{
	String designation="teacher";
	String college="avr and svr";
	void work()
	{
		System.out.println("teaching");
	}
	
}
 public class Physicsteacher extends Teacher{
	String mainsubject="physics";
	
	public static void main(String args[]){
		Physicsteacher obj = new Physicsteacher();
		System.out.println(obj.college);
		System.out.println(obj.designation);
		System.out.println(obj.mainsubject);
		obj.work();
	

}
}
