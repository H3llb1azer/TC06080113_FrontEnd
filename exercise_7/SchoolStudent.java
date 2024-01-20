package exercise_7;

public class SchoolStudent extends Student{
	private int classname;
	
	public SchoolStudent() {}
	
	public SchoolStudent(int rollno, float percentage, int classname) {
		super(rollno,percentage);
		this.classname=classname;
	}
	
	public void show() {
		System.out.println("Roll NO: "+this.getRollno()+" Percentage: "+this.getPercentage()+" Class Name: "+ this.classname);
	}
}
