package exercise_5;
import java.util.Scanner;

public class MathOperation {
	public MathOperation() {}
	
	public int multiply(int x, int y) {
		return x*y;
	}
	
	public float multiply(float x, float y) {
		return x*y;
	}
	
	public double multiply (double x, int y) {
		return x*y;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MathOperation m = new MathOperation();
		System.out.println("Enter 2 Integer Values: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter 2 Float Values: ");
		float x2 = sc.nextFloat();
		float y2 = sc.nextFloat();
		System.out.println("Enter 1 Double Value: ");
		double x3 = sc.nextDouble();
		
		System.out.println("Multiplication Result -- ");
		System.out.println("INT x INT -- "+m.multiply(x1,y1));
		System.out.println("FLOAT x FLOAT -- "+m.multiply(x2, y2));
		System.out.println("DOUBLE x INT -- "+m.multiply(x3, y1));
		
		sc.close();
	}
}
