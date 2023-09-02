package packageJava;




class Human1{
	int age;
	String name;
	Human1(){
		System.out.println("Human class defualt constructor");
	}
	Human1(int age,String name){
		this.age=age;
		this.name=name;
		}
	void display() {
		System.out.println(age+" "+name);
	}
}
class Student1 extends Human1{
	int mark;
	int roll;
//	Student1(){
//		System.out.println("student class default constructor");
//	}
	Student1(int mark,int roll,int age,String name){
		super(age,name);
		this.mark=mark;
		this.roll=roll;
	}
	Student1(int mark){
		this(mark,0,0,null);
		
	}
	Student1(){
		System.out.println("student1 class defualt constructor");
	}
	void display1() {
		super.display();
		System.out.println(mark+" "+roll);
	}
	
}

public class inheritanConstructor {
	public static void main(String[] args) {
		Human1 h1=new Human1(55,"trishu");
		h1.display();
		Student1 s=new Student1(500,01,25,"deeepak");
		Student1 s1=new Student1(400);
		Student1 s2=new Student1();
		s.display1();
		s1.display1();
		System.out.println(h1.hashCode());
		System.out.println(s1.equals(s));
		
	}

}
