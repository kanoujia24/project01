package packageJava;

public class arrayTest {
	public static void main(String[] args) {
		int a[] =new int[5];//declaration
		 a[0]= 12;// initialization
		 a[1]= 20;
		 a[2]= 25;
		 a[3]= 50;
		 a[4]= 20;
		 for(int i=0;i<a.length;i++) {
		 System.out.println(a[i]+" ");
		 }
		 //OR
		 
		  for(int i:a) {
			  System.out.print(i+" ");
		  }
		  
		  int a1[] = {10,20,45,13,14,71};// declaration and initialization together
		  for(int i:a1)
			  System.out.println(i);
		  System.out.println(a1[3]);
		  
		  int a3[][]= {{4,5,8,8},
				      {4,5,8,7},
				      {2,6,8,4},
				      {5,4,6,8}};
		  System.out.println(a3[2][3]+" ");
		  
		  for(int i=0;i<a3.length;i++) {
			  for(int j=0;j<a3.length;j++) {
				  System.out.print(a3[i][j]+" ");
			  }
			  System.out.println();
		  }
		  
		  for(int i=0;i<a3.length;i++) {//IF WANT TO CONVERT WHOLE MATRIX IN SAME NMBR AT ALL PLACE
			  for(int j=0;j<a3.length;j++) {
				  System.out.print(a3[2][1]+" ");
			  }
			  System.out.println();
		  }
		  
		  int sum=0;
		  for(int i=0;i<a3.length;i++) {
			  for(int j=0;j<a3.length;j++) {
				  if(i==j) {
					  sum=sum+a3[i][j];
				  }
		 }
			  }
			  System.out.println(sum);
			  
			  
			 
		  }
}
