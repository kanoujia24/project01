package packageJava;

class Bank{
	int rateOfInterest() {
	return 0;
	}
	}
class IDFC  extends Bank{
	int rateOfInterest() {
		return 10;
		}
}
class imps  extends Bank{
	int rateOfInterest() {
		return 12;
		}
}
class kmps  extends Bank{
	int rateOfInterest() {
		return 111;
		}
}
class knb  extends Bank{
	int rateOfInterest() {
		return 100;
		}
}

public class runtimePolymorphisam {
	public static void main (String[] args) {
//	Bank r=new IDFC();
//	imps b=new imps();
//	 kmps  h=new  kmps ();// THIS IS NOT GOOD APPROCH BECAUSE HERE WE RIGHTING SEPERATE CODE FOR EACH OBJECT
//		knb p=new knb();
//		System.out.println(r.rateOfInterest());
//		System.out.println(b.rateOfInterest());
//		System.out.println(h.rateOfInterest());
//		System.out.println(p.rateOfInterest());
		
		Bank bk;
		bk=new IDFC();
		System.out.println(bk.rateOfInterest());
		bk=new imps();
		System.out.println(bk.rateOfInterest());
		bk=new kmps();
		System.out.println(bk.rateOfInterest());
		bk=new knb();
		System.out.println(bk.rateOfInterest());
		
		
		
	}
}
