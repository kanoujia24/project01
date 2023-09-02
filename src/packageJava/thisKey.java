package packageJava;

public class thisKey {

	
	//THIS IS USED TO REFERS THE CURRENT CLASS INSTANCE VARIABLE
//	int roll;
//	int mark;
//	String name;
//	thisKey(int roll,int mark,String name){
//		this.roll=roll;
//		this.mark=mark;
//		this.name=name;
//	}
//	void display(){
//		System.out.println(roll+" "+mark+" "+name);
//	}
//	public static void main(String[] args) {
//		thisKey k=new thisKey(11,50,"deepak");
//		thisKey k1=new thisKey(111,150,"deepakk");
//		k.display();
//		k1.display();
//	}
	
	//THIS is used to invoke the current class constructor means calling a constructor from another constructor
	int id;
	int roll;
	int age;
	String name;
	thisKey(int i,int rn,int ag){
		id=i;
		roll=rn;
		age=ag;
	}
	thisKey(int rn,int ag,String nam){
	     roll=rn;
	     age=ag;
		name=nam;
	}
	thisKey(int rn,int ag){
		this(rn,ag,null);//this constructor call above constructor
		
		}
	void display() {
		System.out.println(id+" " +roll+" "+age+" "+name);
		
	}
	void changeName(String name1) {// mathed is used to change the name 
		name=name1;
		this.display();//THIS is used to invoke current class method it is optional to write this because jvm automatically add this() methid
	}
	public static void main(String[] args) {
		thisKey k=new thisKey(45,12,18);
		thisKey k1=new thisKey(40,11,"trishu");
		thisKey k2=new thisKey(10,45);
		k.display();
		k1.display();
		k2.display();
		//k1.changeName("nisha");//advatage of invoking current class mathed is there is no extra calling of method display() for k1 
		//k1.display();
	}
}
