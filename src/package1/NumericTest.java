package package1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NumericTest {
	public static void main(String[] args) {

//	                                                     //REVERSE THE INTEGER NUMBER	
//	int n= 542613248;
//	int rev=0;
//	int r=0;
//	while(n>0) {
//		r=n%10;
//		rev=rev*10+r;
//		n=n/10;
//	}
//	System.out.println(rev);
	                                               //CHECK THE NUMBER IS POLYNDROM OR NOT
		
//		int n =3553;
//		int orignaln=n;
//		int rev=0;
//		int i;
//		while(n>0) {
//			i=n%10;
//			rev=rev*10+i;
//			n=n/10;
//		}
//		if(orignaln==rev) {
//			System.out.println("number is polyndrom");
//		}
//		else{
//			System.out.println("number is not polyndrom");
//		}
//		
		
		//CHECK THE NUMBER IS PRIME OR NOT

//	int n1=53;
//	boolean flag=false;
//	int i=2;
//	while(i<n1) {
//		if(n1%i==0) {  
//			flag=true;
//		break;
//		}
//	i++;
//	}
//		if(flag==false){
//			System.out.println("prime number");
//		}
//		else {
//			System.out.println("non prime number");
//		}

//	
//	                                          //FIND THE LCF/GCD OF THE GIVEN NUMBER
//	int a=50;
//	int b=120;
//	int hcf=0;
//	int small=a>b?b:a;
//	System.out.println(small);
//	int c=small;
//	while(c>=1) {
//		if(a%c==0 && b%c==0)
//		break;
//		c--;
//		}
//	hcf=c;
//	System.out.println(hcf);

//	//FIND THE HCF
//	int a1=50;
//	int b1=30;
//	int big=a1>b1?a1:b1;
//	int lcm=0;
//	int d=big;
//	while(d>=big) {
//		if(d%a1==0 && d%b1==0)
//			break;
//		d++;
//	}
//	lcm=d;
//	System.out.println(lcm);

//		                                     //POWER FUNCTION
//		
//		int i=10;
//		int j=4;
//		int power=1;
//		while(j>=1) {
//			power=power*i;
//			j--;
//		}
//		System.out.println(power);

		                                        // FABBONICI SERIES

//		int a=0;
//		int b=1;
//		int c=0;
//		System.out.print(a+" ");
//		System.out.print(b+" ");
//		int n=5;
//		while(n>=1) {
//			c=a+b;
//			System.out.print(c+" ");
//			a=b;
//			b=c;
//			n--;
//		}

		                                 // FIND THE FACTORIAL OF GIVEN NUMBER
//		int i=10;
//		int fact=1;
//		while(i>1) {
//			fact=fact*i;
//			i--;
//			}
//		
//		System.out.print(fact);

		// SWAPPING TWO NUMBERS
		
		

//		int x=5;
//		int y=10;
//		int t;
//		
//		System.out.println("number before swapping"+" "+x+" "+y);
//		
//		t=x;
//		x=y;
//		y=t;
//		
//		System.out.println("number after swapping"+" "+x+" "+y);

		// ARRANGE THE ARRAY ASCENDING ORDER

//		int a[]= {5,45,2,42,5,4,8,7,2,41,20,11,13,14,11};
//		int temp;
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if(a[i]<a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			for(int k:a)//it is use to print each step for swapping
//				System.out.print(k+" ");
//			System.out.println();
//			}
//		}
//		for(int i:a)//it is use to print the arranged array
//			System.out.print(i+" ");

//		                                            //PRINT THE AAL EVEN NUMBER FROM 0 TO 100
//		
//		for(int i=0;i<=100;i++) {
//			if(i%2==0) {
//				System.out.println("the even numbers are"+" "+i+" ");
//			}
//			
//			}
//	                                                  //PRINT THE AAL odd NUMBER FROM 0 TO 100
//		
//		for(int i=0;i<=100;i++) {
//			if(i%2!=0) {
//				
//				System.out.print(" "+i+" ");
//			}
//			
//			}

		                                         // PRINT THE LARGEST NUMBER AMONG THREE
//		 int a=250;
//		 int b=500;
//		 int c=75;
//		 if(a>=b && a>=c) {
//			 System.out.println("a is greater than b & c");
//			}
//		 else if(b>=a && b>=c) {
//			 System.out.println("b is greater than a & c");
//		 }
//		 else {
//			 System.out.println("c is greater than a & c");
//		 }

		// PRINT THE SMALLEST NUMBER AMONG THREE
//		 int a=25;
//		 int b=500;
//		 int c=75;
//		 if(a<=b && a<=c) {
//			 System.out.println("a is SMALLER than b & c");
//			}
//		 else if(b<=a && b<=c) {
//			 System.out.println("b is SMALLER  than a & c");
//		 }
//		 else {
//			 System.out.println("c is SMALLER  than a & c");
//		 }

		                            // find the sum of natural number

//		int i=1;
//		int n=100;
//		int sum=0;
//		while(i<=n) {
//			sum=sum+i;
//			i++;
//		}
//	
//		System.out.println("sum of natural numbers is"+" "+sum);

		                                 // CHECK GIVEN NUBER IS PERFECT SQUARE OR NOT

//		int n=81;
//		int i=1;
//		boolean flag=false;
//		while(i<=n) {
//			if(n%i==0 && n/i==i) {
//				flag=true;
//				break;
//			}
//			i++;
//			}
//		if(flag==true) {
//			System.out.println("n is perfect square");
//		}
//			else {
//				System.out.println("n is not perfect square");
//			}

		                                                  // ARRAY PROGRAMS

	                                                         	// 1. coping the whole array

//		int a1[]= {4,5,8,8,2,8,2,8};
//		int a2[]=new int [a1.length];
//		
//		System.out.println("origional array");
//		for(int i:a1)
//			System.out.print(i+" ");
//		System.out.println();
//		
//		for(int i=0;i<a1.length;i++) {
//			a2[i]=a1[i];
//		}
//		System.out.println("new array");
//		for(int i:a2)
//			System.out.print(i+" ");

	                          	// FIND WHEATHER THE NUMBER IS PRESENT IN ARRAY IF YES THEN AT WHAT INDEX
		
		
//     int a[]= {65,80,20,50,30,60,10,70,90,100 };
//     int n=30;
//     int COUNT=0;
//     //boolean flag=false;
//     for(int i=0;i<a.length;i++) {
//    	 if(a[i]==30) {
//    		 //flag=true;
//    		 System.out.println("30 is perenet at"+" "+i);//it prnit at which index present
//    		 COUNT++;
//    		 }
//     }
//    	 if(flag==true) {
//    		 System.out.println("30 is perenet at"+" "+" "+COUNT);//it print how many times present
//    	 }
//    	 else {
//    		 System.out.println("30 is not perenet at");
//    	 }

//		                                                         //FIND THE HIGHEST NMBR OF THE ARRAY
//		int a[]= {65,80,20,50,30,60,10,70,90,100 };
//		int high=a[0];
//		for(int i=0;i<a.length;i++) {
//			if(high<a[i]) {
//				high=a[i];
//			}
//			}
//		System.out.println(high);

	                                             	// FIND THE SMALLEST NMBR OF THE ARRAY
		
//				int a[]= {65,80,20,50,30,60,10,70,90,100 };
//				int small=a[0];
//				for(int i=0;i<a.length;i++) {
//					if(small>a[i]) {
//						small=a[i];
//					}
//				}
//				System.out.println(small);

		                                                       // ARRAY ARRANGED IN ASCENDING ORDER
//		
//		int a[]= {45,23,78,42,46,86,47,42,21,58,4,9,44,11,22,40,34,25,64};
//		int temp=a[0];
//		for( int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if(a[i]<a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			
//		}
//		for(int i:a)
//		System.out.print(i+" ");

		                                              // ARRAY ARRANGED IN DESCENDING ORDER

//		int a[]= {45,23,78,42,46,86,47,42,21,58,4,9,44,11,22,40,34,25,64};
//		int temp=a[0];
//		for( int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			
//		}
//		for(int i:a)
//		System.out.print(i+" ");
		
		                           //HOW MANY TIME DUPLICATE ELEMENT PRESENT IN AARAY
		
		
//		Set<Integer> hs=new HashSet<Integer>();
//		int count =0;
//		int a[]= {42,46,42,45,78,89,75,45,46};
//		for(int i:a) {
//			if(!hs.add(i)) {
//				System.out.print(i+" ");
//				count++;
//				
//			}
//		}
//		System.out.println();
//		System.out.print(count);
		
		                          //PRINT THE EACH ELEMENT OCCURENCE IN ARRAY
		
//		int a[]= {45,23,87,52,45,23,85,48,48,53,56,52,23,25};
//		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
//		for(Integer s:a) {
//			if(hm.containsKey(s)) {
//				int i=hm.get(s);
//				hm.put(s, i+1);
//			}
//			else {
//				hm.put(s, 1);
//				
//			}
//		}
//		System.out.print(hm);
		
		                                             //ARRANGE THE ELEMENT IN ONE SIDE
//		int[] a= {0,1,0,1,0,0,1,1,1,0,1,1,1,0,1,0,1};
//		int st=0;
//		int ed=a.length-1;
//		while(st<ed) {
//			if(a[st]==0) {
//				st++;
//				continue;
//			}
//			if(a[ed]==1) {
//				ed--;
//				continue;
//		}
//			int temp =a[st];
//			a[st]=a[ed];
//			a[ed]=temp;
//		}
//		for(int i:a)
//			System.out.print(i+" ");
		
//		int[] a= {1,2,0,1,0,1,0,0,2,1,1,2,2,1,0,1,1,2,1,0,1,2,0,2,1};
//		int st=0;
//		int mid=0;
//		int ed=a.length-1;
//		while(mid<=ed) {
//			if(a[mid]==0) {
//				int temp=a[st];
//				a[st]=a[mid];
//				a[mid]=temp;
//				st++;
//				mid++;
//				continue;
//			}
//			if(a[mid]==2) {
//				int temp=a[mid];
//				a[mid]=a[ed];
//				a[ed]=temp;
//				ed--;
//				continue;
//			}
//			if(a[mid]==1) {
//				mid++;
//			}
//		}
//		for(int i:a)
//			System.out.print(i+" ");
		
		                        //PRINT THE TWO NUMBER WHOSE SUM IS EUAL TO GIVEN NUMBER
		
//		int[] a= {4,3,6,5,8,0,10,9,7,4,12,5,7,8,9,2,5,9,5};
//		int n=10;
//		Set<Integer> st=new HashSet<Integer>();
//		for(int i:a) {
//		int sub=n-i;
//		if(st.contains(sub)) {
//			System.out.println(i+" "+sub);
//		}
//		else {
//			st.add(i);
//		}
//		}
		
		                                                 // STRING PROGRAMM
		
	                                                  	// USING charAt() METHOD

//		String s="Deepak Kumar";
//		System.out.print(s.charAt(5));
		                                              // PRINT THE CHARACTER AT FIRST AND LAST
//		String s="my name is deepak";
//		int slength=s.length();
//		System.out.println(" character at 0 index"+" "+s.charAt(0));
//		System.out.println(" character at last index"+" "+s.charAt(slength-1));

		                                                // PRINT THE CHARACTER PRESENT AT EVEN INDEX

//		String s="my name is deepak kumar kanoujia";
//		for(int i=0;i<s.length()-1;i++) {
//			if(i%2==0) {
//				System.out.println("character at"+" "+i+"is"+" "+s.charAt(i));
//			}
//		}

	                                            	// PRINT THE CHARACTER PRESENT AT ODD INDEX

//		String s="my name is deepak kumar kanoujia";
//		for(int i=0;i<=s.length()-1;i++) {
//			if(i%2!=0) {
//				System.out.println("character at"+" "+i+""+"is"+" "+s.charAt(i));
//			}
//		}

		                             // PRINT THE FREQUENCY OF ANY NUMBER OR CHARACTER PRESENT IN STRING OR NOT

//		String s = " my name is deepak kanojia";
//		boolean flag = false;
//		int count = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) == 'e') {
//				flag = true; 
//				count++;
//				System.out.println("e is present" + " " + count);
//			}
//		}
//		if (flag == true) {
//			System.out.println("e is present" + " " + count);
//		} else {
//			System.out.println("e is not present");
//		}

		
		                                    //USE OF METHOD indexOf() AND lastIndexOf()
//		String s = "my name is deepak kanojia";
		//		System.out.println(s.indexOf('e'));
//		System.out.println(s.indexOf("deepak"));
//		System.out.println(s.indexOf("is", 9));
//		System.out.println(s.lastIndexOf('a'));
//		System.out.println(s.lastIndexOf("deepak"));
//		System.out.println(s.lastIndexOf('d',15));
//		System.out.println(s.lastIndexOf("is",10));
//		System.out.println(s.trim());
//		System.out.println(s.length());
		
	                     	//PRINT THE TOTAL NUMBER OF CHARACTER AND REVERSE THEM USING LENGTH() METHOD
		
//		String s="deepakkumar";
//		if(s.length()==0) {
//			System.out.println("string is not empty:"+" "+count);
//		}
//		
//		int slength=s.length();
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
		
		                           //	convert STRING INTO ARRAY OF CHARACTER
		
 //    	String s="deepak";
//		System.out.println(s.substring(1, 5));
//		char[] a=s.toCharArray();
//		for(char k:a)
//			System.out.print(k);
		
		
		                                    //print total number of character and reverse the string
//		String s="deepakkumar";
//		int count=0;
//		for(int i=0;i<=s.length()-1;i++) {
//			if(s.charAt(i)!=0) {
//				count++;
//			} 
//		}
//		System.out.println(count);
		
//		String s = "my name is deepak";
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)!=0 && s.charAt(i)!=' ' ) {
//				count++;
//			}
//		}
//		System.out.println("total numbar of character present"+" "+count);
		
		
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i)); 
		
		
		                                           //SWAP TWO STRING WITHOUT USING THIRD STRING
//		String s1="deepak";
//		String s2="kanoujia";
//		System.out.println("String without swapping");
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		 s1=s1+s2;
//		 s2=s1.substring(0,(s1.length()-s2.length()));
//		 s1=s1.substring(s2.length());
//		 
//		 System.out.println("String after swapping");
//		 System.out.println(s1);
//		 System.out.println(s2);
		
		                                        // find the word present in the string
//		String s="i am a good boy";
//        String[] arr=(s.split("\\s+"));
//        for(String a:arr)
//       	System.out.print(a);
//        int count=0;
//        for(int i=0;i<arr.length;i++) {
//        	if(s.charAt(i)!=0) {
//        		count++;
//        	}
//        }
//        System.out.println();
//	    System.out.println(arr.length);
		
		                                              //PRINT THE DUPLCATE ELEMENT AND NUMBER OF TIMES   
//		String s="deepakk ";
//		int length=s.length();
//		 System.out.println("duplicate element are:");
//		int count;
//		char ch[]=s.toCharArray();
//		for(int i=0;i<length;i++) {
//			count=1;
//			for(int j=i+1;j<length;j++) {
//				if(ch[i]==ch[j] && ch[i] !=' ') {
//					count++;
//					ch[j]=0;
//				}
//			}
//			if(count>1 && ch[i]!='0') {
//				 System.out.println(ch[i]+" "+count);
//			}
//			
//		}
	                                            	
	                                        	//PRINT THE NUMBER OF VOWEL 
		
//		int count=0;
//		boolean flag=false;
//		
//		String s="i am a good boy";
//		s=s.toLowerCase();
//		int length=s.length();
//		  for(int i=0;i<s.length();i++){
//			  if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
//				  flag=true;
//				  count++;
//			  }
//			  }
//		  if(flag=true) {
//			  System.out.print("number of vowel "+count);
//			  }
//		
//		                            //PRINT THE NUMBER OF VOWEL AND CONSONANT PRESENT BOTH TOGETHER
//		
//		int vcount=0;;
//		int ccount=0;;
//		String s="my NAME IS depak";
//		s=s.toLowerCase();
//		int length= s.length();
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
//				vcount++;
//			}
//			else if(s.charAt(i)>'a' && s.charAt(i)<'z') {
//				ccount++;
//			}
//		}
//		System.out.println("number of vowel "+vcount);
//		System.out.println("number of consonant "+ccount); 
    	 
    	 
		                                      //PRINT THE EACH ELEMENT OCCURENCE IN ARRAY
		
//		String s="deepakkumarkanoujia";
//		Map<Character,Integer> mp=new HashMap<Character,Integer>();
//		for(char ch:s.toCharArray()) {
//			if(mp.containsKey(ch)) {
//				int i=mp.get(ch);
//				mp.put(ch, i+1);
//			}
//			else {
//				mp.put(ch, 1);
//			}
//		}
//		
//		System.out.println(mp);       
		                                       //PROGRAM TO CHECK GIVEN STRING IS POLYNDROM
		
//		String s= "Madam";
//		String rs= "";
//		int slength =s.length();
//		for(int i=(s.length()-1);i>=0;i--) {
//			rs= rs+s.charAt(i);
//			}
//			if(s.toLowerCase().equals(rs.toLowerCase())) {
//				System.out.println("string is polyndrom");
//			}
//			else {
//				System.out.println("string is not poyndrom");
//			}
		
		
		                                                     //PROGRAM FOR PYRAMID
		
		                                                     // PRINT HALF PYRAMID
//    	 
//    	 int row=5;
//    	 for(int i=1;i<=row;i++) {
//    		 for(int j=1;j<=i;j++) {
//    			 System.out.print( "* ");
//    		 }
//    		 System.out.println();
//          }
		                                                 //PRINT REVERSE HALF PYRAMID
//		int row=6;
//		for(int i=row;i>=1;i--) {
//			for(int j=i;j>=1;j--) {
//				System.out.print("* ");
//		    }
//			System.out.println( );
//		}
//    	 
                                                           	 // HALF PYRAMID FOR NMBER
    	 
//    	int row =10;
//    	for(int i=1;i<=row;i++) {
//    		for(int j=1;j<=i;j++) {
//    			System.out.print(j+" ");
//    		}
//    		System.out.println();
//    	}
    	                                               //PRINT REVERSE HALF PYRAMID FOR NUMBER
		
//		int row=10;
//		for( int i=row; i>=1;i--) {
//			for(int j=i;j>=1;j--) {
//				System.out.print( j+ " ");
//			}
//			System.out.println( );
//			}
		
		                                                 //PRINT HALS PYRAMID FOR CHARACTER
		
//		char last= 'T';
//		char alphabet= 'A';
//		for (int i=1;i<=(last-'A'+1);i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print( alphabet+" ");
//			}
//			alphabet++;
//			System.out.println( );
//		}
		
		                                    //PRINT REVERSE HALF PYRAMID FOR CHARACTER
		
//		char last='T';
//		char alphabet='A';
//		for(int i=(last-'A'+1);i>=1;i--) {
//			for(int j=i;j>=1;j--) {
//				System.out.print(alphabet+" ");
//			}
//			alphabet++;
//			System.out.println();
//		}
    	 
		
			                                       // PRINT THE FULL PYRAMID
////		int input;
////		Scanner sc=new Scanner(System.in);
////		input=sc.nextInt();
		
//		int row=6;
//		for(int i=1;i<=row;i++) {
//			for(int j=row;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print('*'+" ");
//			
//	        }
//			System.out.println();
//			}
		
		
		                                              //PRINT REVERSE PYRAMID 
//		int row=6;
//		for(int i=1;i<=row;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//				}
//			for(int k=1;k<=row-i;k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		                                                     //PRINT FULL PYRAMID FOR NUMBER
		  
//		int row=10;
//		for(int i=1;i<=row;i++) {
//			for(int j=row;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}
		
		                                                           //REVERSE PYRAMID FOR NUMBER
		
//		int row =10;
//		for(int i=1;i<=row;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=row-i;k++) {
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}
		
	}
}