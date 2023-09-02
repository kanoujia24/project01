package packageJava;

interface Play1{
	int n=50;
	void run();
	static void eat() {
		System.out.println(" eat plaese");
	}
}
interface Play2 extends Play1 {
	void go();
default void sleep() {
	System.out.println("default sleep");
}
}


public class intarfaceTest implements Play2 {
	public void run() {
		System.out.println(" play1 run");		
		}
	public void go() {
		System.out.println(" play2 run");		
		}
	public static void main(String[] args) {
		
		intarfaceTest i=new intarfaceTest();
		i.run();
		i.go();
	    // i.n=40;//not change the value because of final and 
	     //System.out.println(Play1.n);
		i.sleep();
		Play1.eat();
	}

}
