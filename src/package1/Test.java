package package1;

public class Test {
   public static void main(String [] args) {
	   int a[]= {4,6,8,2,7,2,4,2};
	   boolean flag=false;
	   for(int i=0;i<a.length;i++) {
		  if(a[i]==7) {
			  flag=true;
			  break;
		 }
	   } if(flag=true) {
			  System.out.println("true");
		  }
		  else {
			  System.out.println("false");
		  }
   
}
}