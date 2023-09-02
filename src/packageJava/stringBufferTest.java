package packageJava;

public class stringBufferTest {
public static void main(String[] args) {
	String s1="deepak";
	StringBuffer sb=new StringBuffer(s1);
//	sb.append("kumar");
//	System.out.println(sb);
	
//	sb.insert(4,"trishu");
//	System.out.println(sb);
	
//	sb.replace(1, 5, "trishikak");
//	System.out.println(sb);
	
//	sb.delete(2, 05);
//	System.out.println(sb);
	
//	sb.reverse();
//	System.out.println(sb);
	
	
	//System.out.println(sb.capacity());//result will be 23 because initail capacity is 16 without argument
	
	//System.out.println(sb.charAt(4));
	
	//System.out.println(sb.length());
	
	//System.out.println(sb.substring(4));
	System.out.println(sb.substring(0,5));
	
}
}
