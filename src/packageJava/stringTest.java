package packageJava;

public class stringTest {
	public static void main(String[] args) {
		String s1=new String("java");
		String s2=new String("java");
		String s3=new String("JAVA");
		String s4="java";
		String s5="java";
		System.out.println(s1);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));//this method ignore the uppercase and lowercase 
		System.out.println(s1==s2);
		System.out.println(s5==s4);
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		String s6="deepak";
		s6.concat("kumar");
		System.out.println(s6);
		String s7=s6.concat("kumar");
		System.out.println(s7);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s6));
		
		String s8="kanoujia";
		String s9=s6+" "+s8;
		//System.out.println(s9);
		System.out.println(s6+" "+s8);
		String s10=s6.concat(s8);
		//System.out.println(s10);
		System.out.println(s6.concat(" "+s8));
		
		String s11=15+231+45+47+"deepak"+45+45+86+86+11;
		System.out.println(s11);
		
		System.out.println("original String"+" "+s10);
		System.out.println("string start from 4 is"+" "+s10.substring(4));
		System.out.println("string start from 4 to 10"+" "+s10.subSequence(4, 10));
		System.out.println("string start from 0 to 14"+" "+s10.substring(0, 14));
		
//		s1="jeetu";
//		System.out.println(s1);
		
		String s12="my name is deepak";
		String arr[]=s12.split(" ");
		for(String a:arr)
			System.out.println(a);
		System.out.println(arr.length);
	
		
		
			
		}
		
	
	}
