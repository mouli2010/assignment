class Teache
{
	private String designation="teacher";
	private String college="avr and svr";
	
	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	protected String getDesignation() {
		return designation;
	}

	protected void setDesignation(String designation) {
		this.designation = designation;
	}

	void work()
	{
		System.out.println("teaching");
	}
}
class Physicsteache extends Teache{
	String mainsubject="physics";
}
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println(obj.college);
		Physicsteache obj = new Physicsteache();
		System.out.println(obj.getDesignation());
		System.out.println((obj.getCollege()));
		System.out.println(obj.mainsubject);
		obj.work();

	}

}
