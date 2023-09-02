package packageJava;

class ABC{
	int peple=50;
	}

class Human extends ABC {
	int age;
	String name="DEEPAK";
	
	void display() {
	 System.out.println(age);
	 System.out.println(name);
	 }
	
	 void parent() {
		 System.out.println("parent class inheritance");
		  }
	
	
	}
class Student extends Human{
	
		//super(age, name);

	int roll;
	int marks;
	String name="TRISHU"; 
	void display1() {
		System.out.println(roll);
		System.out.println(marks);
		System.out.println(name);
		System.out.println("child class inheritance");
	}
	}
public class Inheritance {
	public static void main (String[] args) {
		Human h1=new Human();//arguments can remove this only for valdation of coparable interface
		System.out.println(h1.name);
		Student s=new Student();//arguments can remove this only for valdation of coparable interface
		System.out.println(s.name);
		s.roll=15;
		s.marks=500;
		s.name="deepak";
		s.display();
		s.parent();
		s.display1();
		System.out.println(h1.peple);
		System.out.println(s.peple);
	}
}
