package packageJava;

 abstract class D{
	 int roll=12;//instance variable of parent but after inheritance it will also works as instance variable for child class
	 int mark=125;
	 String name="deepak";
	 int age;
	 int nmbr;
	 D(int age, int nmbr){//constructor
		 this.age=age;
		 this.nmbr=nmbr;
		 System.out.println("PARENT CLASS CONSTRUCTOR");
	 }
	abstract  void display();
	
 static void print() {
	 System.out.println("parent class static method");
 }
 }
public class Abstruction extends D{
//	int roll=12;//instance variable
//	int mark=125;
//	String name="deepal";
	 Abstruction(int age,int nmbr){
		 super(age, nmbr);
	 }
	void display() {
		 System.out.println(roll+" "+mark+" "+name+" "+age+" "+nmbr);
	 }
	static void don() {
		 System.out.println("child class static mathed");
	}
	public static void main(String args[]) {
		D d=new Abstruction(23,400);
		d.display();
		 D.print();
		 Abstruction.don();
	}
}
