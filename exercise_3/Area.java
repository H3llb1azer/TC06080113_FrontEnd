package exercise_3;
import java.util.Scanner;

public class Area {
	Scanner sc = new Scanner(System.in);
	
	int l,b;
	void setDim() {
		System.out.print("Enter Length: ");
		this.l=sc.nextInt();
		System.out.print("Enter Breadth: ");
		this.b=sc.nextInt();
	}
	
	int getArea() {
		return (l*b);
	}
	
	public static void main(String args[]) {
		Area a = new Area();
		a.setDim();
		System.out.print("Area: "+a.getArea());
	}
}
