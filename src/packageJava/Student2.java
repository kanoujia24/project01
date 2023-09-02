package packageJava;

import java.util.Comparator;

public class Student2 implements Comparator<Student2> {
	int age;
	int mark;
	String name;
	Student2(int age,int mark,String name){
		this.age=age;
		this.mark=mark;
		this.name=name;
	}
	
	void printDetails() {
		System.out.println(age+" "+mark+" "+name);
	}
	public static void main(String[] args) {
		Student2 s=new Student2(23,500,"deepak");
		Student2 s1=new Student2(21,600,"trishu");
		Student2 s2=new Student2(26,800,"gyan");
		s.printDetails();
		s1.printDetails();
		s2.printDetails();
		

	}

	@Override
	public int compare(Student2 s, Student2 s1) {
		if(s.age>s1.age) return 1;
		else if(s.age<s1.age) return -1;
		else return 0;
	}

	
}
