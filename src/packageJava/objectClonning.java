package packageJava;

public class objectClonning implements Cloneable {
	
	int i;
	int j;
	objectClonning(int i, int j){
		this.i=i;
		this.j=j;
		}
	void printDetails() {
		System.out.println(i+" "+j);
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		objectClonning o1=new objectClonning(50,40);
		o1.printDetails();
		objectClonning o2= (objectClonning) o1.clone();
		o2.printDetails();
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
	}
	

}
