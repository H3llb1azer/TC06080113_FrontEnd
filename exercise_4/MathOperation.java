package exercise_4;

public class MathOperation {
	private int x,y,r;
	
	public MathOperation() {
	}
	
	public void init(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void add() {
		this.r=this.x+this.y;
	}
	
	public void multiply() {
		this.r = this.x * this.y;
	}
	
	public void power () {
		this.r=1;
		for (int i=0; i<this.y; i++) {
			this.r=this.r*this.x;
		}
	}
	
	public void display() {
		System.out.println("R = "+this.r);
	}
	
	public static void main(String[] args) {
		MathOperation m = new MathOperation();
		m.init(20,3);
		m.add();
		m.display();
		m.multiply();
		m.display();
		m.power();
		m.display();
	}
}
