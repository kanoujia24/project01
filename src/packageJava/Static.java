package packageJava;

public class Static {
	int roll;
	int marks;
	String name;
	static String college ="BBD";//static variable
	Static(int roll,int marks,String name){
		this.roll=roll;
	this.marks=marks;
	this.name=name;
	}
	void display() {
		System.out.println(roll+" "+marks+" "+name);
		}
	static void staticMethod() {
		System.out.println("staticMethod");//here we can't access name marks roo becuse they are instance varble here we can access college 
	}
	static void changeName(String college) {
		System.out.println("changename");
		Static.college=college;//varible same but not use this is used with instance here static varible so used class name for differentiate them
		System.out.println(Static.college);
	}
	public static void main (String[] args) {
		Static s1=new Static(12,105,"deepak");
		Static s2=new Static(12,105,"deepak");
		Static s3=new Static(12,105,"deepak");
		s1.display();
		s2.display();
		s3.display();
		System.out.println(Static.college);
		System.out.println(s1.college);//static varibles can call with object but it hardcore that static vaible method always call with class name
		System.out.println(s2.college);//
		Static.staticMethod();
		Static.changeName("LCIC");
		
	}
}
