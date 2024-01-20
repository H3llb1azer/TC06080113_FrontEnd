package exercise_7;

public class Student {
	private int rollno;
	private float percentage;
	
	public Student () {}
	
	public Student (int rollno, float percentage) {
		this.rollno=rollno;
		this.percentage=percentage;
	}
	

	public int getRollno() {
		return rollno;
	}

	public float getPercentage() {
		return percentage;
	}
	
	public void show() {
		System.out.println("Roll no: "+this.getRollno()+" Percentage: "+this.getPercentage());
	}
}
