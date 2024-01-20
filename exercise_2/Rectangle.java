package exercise_2;

public class Rectangle {
	public int l,b;
	Rectangle(int l, int b){
		this.l=l;
		this.b=b;
	}
	
	public int Area() {
		return (l*b);
	}
	
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(4, 5);
		Rectangle r2 = new Rectangle(5, 8);
		
		int area1=r1.Area();
		int area2=r2.Area();
		
		System.out.print("Rectange 1: "+area1+"\nReactangle 2: "+area2);
	}
}

