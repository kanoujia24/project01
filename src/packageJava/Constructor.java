package packageJava;

public class Constructor {
	
	
//	Constructor(){
//		System.out.println("default constructor is create");// default constructor created
//		}
//	public static void main(String [] args) {
//		Constructor cons=new Constructor();
//	}
	

//    int id;
//    String name;// default constructor used here itself by compiler to initialized and provide value to the object
//    void display() {
//    	System.out.println(id + name);
//    	}
//	public static void main(String [] args) {
//         Constructor cn = new Constructor();
//         cn.display();
//	}
	
	
//	int roll;
//	int mark;
//	String name;
//	Constructor (int rn,int marks,String nm){// parameteriezed constructor
//		roll=rn;
//		mark=marks;
//		name=nm;
//	}
//	void printDetails() {
//		System.out.println(roll+" "+mark+" "+name);
//		}
//		public static void main(String [] args) {
//		Constructor c1=new Constructor(5,50,"deepak");
//		Constructor c2=new Constructor(15,150,"deepakk");
//		c1.printDetails();
//		c2.printDetails();
//	}
	
	//CONSTRUCTOR OVERLOADING
//	int mark;
//	int roll;
//	int age;
//	String name;
//	Constructor(int marks,int rn, String nm){
//		mark=marks;
//		roll=rn;
//		name=nm;
//	}
//	Constructor(int agee){
//		age=agee;
//	}
//	Constructor(int mrks,int rln,int ag,String nme){
//		mark=mrks;
//		roll=rln;
//		age=ag;
//		name=nme;
//	}
//	void printDetails() {
//		System.out.println(mark+" "+roll+" "+age+" "+name);}
//		public static void main(String [] args) {
//		Constructor c1=new Constructor(50,15,"deepak");	
//		Constructor c2=new Constructor(45);	
//		Constructor c3=new Constructor(50,15,49,"deepak");
//		c1.printDetails();
//		c2.printDetails();
//		c3.printDetails();
//	}
	
	
	//COPY VALUES FROM ONE OBJECT TO ANOTHER OBJECT USING CCONSTRUCTOR
//	int id;
//	String name;
//	Constructor(int i, String nm){
//		id=i;
//		name=nm;
//	}
//	Constructor(Constructor c){
//		id=c.id;
//		name=c.name;
//	}
//	void display() {
//		System.out.println(id+" "+name);
//	}
//	public static void main(String[] args){
//		Constructor c=new Constructor(5,"deepak");
//		Constructor c1=new Constructor(c);
//		c.display();
//		c1.display();
//		
//	}
	
	//COPY VALUES FROM ONE OBJECT TO ANOTHER OBJECT WITHOUT CONSTRUCTOR
	int roll;
	int age;
	Constructor(int rl,int agee){
		roll=rl;
		age=agee;
		}
	Constructor(){
		
	}
	void display() {
		System.out.println(roll+" "+age);
	}
	public static void main(String[] args){
	Constructor c=new Constructor(5,50);
	Constructor c1=new Constructor();
	c1.roll=c.roll;
	c1.age=c.age;
	c.display();
	c1.display();
	}
}
