package packageJava;

public class Students implements Comparable<Students> {
	String name;
	int age;
	int marks;
	Students(String name,int marks,int age){
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	void printDetails() {
		System.out.println(name+" "+age+" "+marks);
	}
	public static void main(String[] args) {
		Students s1=new Students("deepak",45,500);
		Students s2=new Students("deepak1",35,600);
		Students s3=new Students("deepak2",55,700);
		s1.printDetails();
		s2.printDetails();
		s3.printDetails();
	}
	
	@Override
	public int compareTo(Students s) {//on the basis of age
		if(this.age>s.age) return 1;
		else if(this.age<s.age) return -1;
		else return 0;
		
//		public int compareTo(Students s) {//on the basis of marks
//			if(this.marks>s.marks) return 1;
//			else if(this.marks<s.marks) return -1;
//			else return 0;
//			
//			public int compareTo(Students s) {//on the basis of name lentgh
//				if(this.name.length()>s.name.length()) return 1;
//				else if(this.name.length()<s.name.length()) return -1;
//				else return 0;
	}

}
