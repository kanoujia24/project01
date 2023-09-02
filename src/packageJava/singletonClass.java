package packageJava;

public class singletonClass {
	static singletonClass o=null;
	private singletonClass(){//for creaiting singleton class privte constructor must be creating
		System.out.println("constructor");
		}
	static singletonClass getObject(){
		if(o==null) {
		 o=new singletonClass ();
		return o;
		}
		else{
			return o;
		}
	}

	public static void main(String[] args) {
		System.out.println(singletonClass.getObject().hashCode());
		System.out.println(singletonClass.getObject().hashCode());
		System.out.println(singletonClass.getObject().hashCode());
		System.out.println(singletonClass.getObject().hashCode());
 	}

}
