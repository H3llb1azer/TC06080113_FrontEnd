package exercise_6;

public class Person {
	private int age;
	private String name;
	
	Person (){
		this.age=18;
	}
	
	public Person (String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println("Name: "+this.name+" Age: "+this.age);
	}
	
	public static void main(String[] args) {
		Person defPerson = new Person();
		defPerson.display();
		Person p2 = new Person("ABC",49);
		p2.display();
	}
}
