package packageJava;

//class Student2{
//	int roll;
//	int mark;
//	String name;
//	Student2(int roll,int mark,String name){
//		this.roll=roll;
//		this.mark=mark;
//		this.name=name;
//		}
//	void display() {
//		System.out.println(roll+" "+mark+" "+name);
//	}
//}
//public class Overriding extends Student2 {
//	int age;
//	Overriding(int roll,int mark,String name,int age){
//		super(roll,mark,name);
//		this.age=age;
//	}
////	void display() {//use of super keyword
////		super.display();
////		System.out.println(age);
////	}
//	void display() {
//		System.out.println(roll+" "+mark+" "+name+" "+age);//it is overriding because we uses method of parent class but field written 
//	}//                                  according to requirement
//	public static void main(String[] args) {
//		Overriding o1=new Overriding(15,500,"deepak",23);
//		o1.display();
//	}
//
//}


class RBI{
	int interest() {
		return 0;
		}
}
	class SBI extends RBI{
		int interest() {
			return 8;
	}
	}
	class BOB extends RBI{
		int interest() {
			return 9;
	}
		}
	class HDFC extends RBI{
		int interest() {
			return 10;
	}
		}
	class PNB extends RBI{
		int interest() {
			return 15;
	}
		}
		public class Overriding{
	public static void main(String[] args) {
		SBI s=new SBI();
		BOB	 b=new BOB();
		HDFC h=new HDFC();
		PNB p=new PNB();
		System.out.println(s.interest());
		System.out.println(b.interest());
		System.out.println(h.interest());
		System.out.println(p.interest());
	}
	}
	