package packageJava;

public class ObjectTest {
	public static void main(String[] args) {
		 int i=10;
		 Object o1=new ObjectTest();
		 Object k=12;
		 int j=(int) k;
		 String s="deepak";
		 System.out.println(j);
		 System.out.println(o1.getClass());
		 System.out.println(o1.hashCode());
		 System.out.println(k.hashCode());
		 System.out.println(s.hashCode());
	}

}
