package packageJava;


public class Overlodding {
static int add(int i, int j) {
	return i+j;
	}
static double add(double i,double j,double k) {
	return i+j+k;
	
}
public static void main(String[] args)	{
//	Overlodding o=new Overlodding();//if not static
//	o.add(4, 6);
//	o.add(4.5,5.5);
	System.out.println(Overlodding.add(4,5));//if static
	System.out.println(Overlodding.add(4.5,5.5,3.5));
}

}
