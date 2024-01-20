package exercise_7;

public class CollegeStudent extends Student {
	private int semester;
	
	public CollegeStudent() {	}
	
	public CollegeStudent(int rollno, float percentage, int semester) {
		super(rollno,percentage);
		this.semester=semester;
	}
	
	public void show() {
		System.out.println("Roll NO: "+this.getRollno()+" Percentage: "+this.getPercentage()+" Semester: "+ this.semester);
	}	
}
